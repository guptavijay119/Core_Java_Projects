package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
	
		
		
		
		List<Integer>  list=Arrays.asList(10,50,80,70,70,40,40);
		
		List<Integer>  resultDistinct=  list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(resultDistinct);
		

	}

}
