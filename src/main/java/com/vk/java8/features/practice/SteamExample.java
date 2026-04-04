package com.vk.java8.features.practice;

import java.text.Collator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamExample {
	
	public static void main(String[] args) {
		
		List<Integer> list= List.of(10,20,30,40,50,50,40,40,40);
		Integer[] newobj= {10,20,30,40,50};
		//System.out.println(newobj[4]);
		//Integer i=newobj[0];
		
		/* normal way to print arrays */
//		for (Integer integer : newobj) {
//			
//			System.out.println(""+integer);
//			
//		}
		/* normal way to print */
		for (Integer integer : list) {
			System.out.println(integer);
			
		}
		System.out.println("-------------------------------");
		
		/* using stream to print  */
		list.stream().forEach(n -> System.out.println(n));
		
		System.out.println("-------------------------------");

		/* find max number using stream */
		Integer maxnumber=list.stream().max(Integer::compare).get();
		
		//Integer maxno=list.stream().max(Integer::compare).get();
		//System.out.println(maxno);
		
		System.out.println(maxnumber);
		
		System.out.println("-------------------------------");
		
		//dublicate remove from list 
		List<Integer> dublicateno=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("dublicate no in list:"+dublicateno);
		
		
		//i want to print dublicate no
		Set<Integer>  setobj=new HashSet<>();
		
		//list.stream().filter(n-> !setobj.add(n)).forEach(System.out.println());
		
		list.stream().forEach(n -> {
            if(!setobj.add(n)) {
                System.out.println(n);
            }
        });

		
		
		
		
		
		//System.out.println(newobj[0]);
		//System.out.println(list);
		
	}

	

}
