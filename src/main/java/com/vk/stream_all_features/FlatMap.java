package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		
		
		//9. flatMap()

	//	Converts multiple collections into single stream.
		
		List<List<Integer>> list =
                Arrays.asList(
                        Arrays.asList(1,2),
                        Arrays.asList(3,4,4)
                );
		
	
		
		
		
	    list.stream().flatMap(x -> x.stream()).forEach(System.out::println);
	 


//        list.stream()
//            .flatMap(x -> x.stream())
//            .forEach(System.out::println);
		
		

	}

}
