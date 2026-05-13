package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		//11. collect()

		//Converts stream into List/Set.
		
		List<Integer> list =
                Arrays.asList(10,20,30,99,9,9)
                      .stream().distinct().sorted()
                      .collect(Collectors.toList());

        System.out.println(list);

	}

}
