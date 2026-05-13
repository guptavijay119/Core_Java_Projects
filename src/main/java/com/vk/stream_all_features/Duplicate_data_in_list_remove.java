package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Duplicate_data_in_list_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> li=Arrays.asList(10,20,30,40,40,50,10,20,30,99,98,97,101,97);
		
	    List<Integer> list=li.stream().distinct().collect(Collectors.toList());
	    Collections.sort(list);
		System.out.println("Stream api via i made :  "+list);
		
	//	HashSet<Integer> set=new HashSet<>(li);
		
		//LinkedHashSet<Integer> set1=new LinkedHashSet<>(li);
		
		TreeSet<Integer>  set2=new TreeSet<>(li);
		
		
		
		//Collections.sort(li);
		//System.out.println(set);
		
		//System.out.println(set1);
		
		System.out.println(set2);
		

	}

}
