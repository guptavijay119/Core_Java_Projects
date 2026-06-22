package com.vk.interview.question.practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_demo {

	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,4,5,19,2,1,3};
		
		int target=9;
		
		Map<Integer, Long> collect = Stream.of(arr).collect(Collectors.groupingBy(num->num,Collectors.counting()));
		
		System.out.println(collect);
		
		//this is not duplicating number in array
		ArrayList<Integer>  listarr1=new ArrayList<>();
		
		
		//this is the duplicate number in array
		ArrayList<Integer>  listarr2=new ArrayList<>();
		
		
		for(Map.Entry<Integer, Long> map:collect.entrySet()) {
			
			if(map.getValue()==1) {
			listarr1.add(map.getKey());
			}
			
			else {
				listarr2.add(map.getKey());
				
			}
			
		}
		
		
		System.out.println("Not Duplicating number: " +listarr1);
		System.out.println("duplicating array list : "  +listarr2);
		
		// target will be 9
		
		
//	//	Collections.sort(arr);
//		
//		List<Integer> list=Arrays.asList(arr);
//		
//		
//		Integer integer = list.stream().skip(2).findFirst().get();
//		
//		
//		System.out.println(integer);
		

	}

}
