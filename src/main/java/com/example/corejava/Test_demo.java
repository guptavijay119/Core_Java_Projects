package com.example.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_demo {

	public static void main(String[] args) {
		
		
		//Find Longest String in a List
		
		//List<String> names = Arrays.asList("Apple", "Banana", "Cherry", "Date");
		
		//names.stream().collect(Collectors.toList());
		
		//System.out.println(names.get(2));
		
	
		
		String s="Apple";
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		String s2="Apple Banana Cherry";
		
		//  o/p String s2="Cherry, Banana,Apple";
		
		List<String>  list=Arrays.asList(s2.split(" "));
		
		//Reverse the list
		Collections.reverse(list);
	//	Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
