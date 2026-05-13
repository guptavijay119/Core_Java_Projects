package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;

public class Peek {

	
	/* Interview Definition

	peek() is an intermediate Stream API method used mainly for 
	debugging and inspecting elements during 
	stream processing without modifying them.   */
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30);

        list.stream()
            .peek(x -> System.out.println("Value: " + x))
            .forEach(System.out::println);
		

	}

}
