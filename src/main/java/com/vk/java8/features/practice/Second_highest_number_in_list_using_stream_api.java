package com.vk.java8.features.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_highest_number_in_list_using_stream_api {

	public static void main(String[] args) {
		
	List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	
	Integer highestnumber=list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
	//highest number in list
	System.out.println("highest number in list : "+highestnumber);
	
	//if second highest number in list
	
	Integer highestnumber2=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(highestnumber2);
	
	
	
	
	
	
	
	

	
		
		

	}

}
