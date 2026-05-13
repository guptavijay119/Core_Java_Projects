package com.vk.stream_all_features;

import java.util.stream.Stream;


public class Limit {

	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6)
        .limit(4)
        .forEach(System.out::println);
		
		
		
}
}


