package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Skip {

	public static void main(String[] args) {
		
	List<Integer> li=Arrays.asList(10,20,30,40,50,60,70);
	
	
	List<Integer> liSkip=   li.stream().skip(4).collect(Collectors.toList());
	
	System.out.println(liSkip);
	
	
	
	
	
		
		
		
}
}


