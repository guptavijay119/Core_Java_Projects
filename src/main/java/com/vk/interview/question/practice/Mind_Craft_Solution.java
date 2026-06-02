package com.vk.interview.question.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mind_Craft_Solution {
	

	
	

	public static void main(String[] args) {
		
		
		//Q.1 compare string 
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		
		
		System.out.println(s1==s2); // true 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println(s1==s3);  //false
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
		
		
		System.out.println(s1.equals(s3));  // true
		
		
		//Q.2 want not repeating characters only
		String s4="aabbcddef";
		
		List<String> list=Arrays.asList(s4.split(""));
		
	Map<String, Long>   resumap=   	list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	System.out.println(resumap);
	
	for (Map.Entry<String, Long> map:resumap.entrySet()) {
		
		if (map.getValue()==1) {
			System.out.println("not repeating characters :"  +map.getKey());
			
		}
		
		else {
			System.out.println("repeating characters : "  +map.getKey());
		}
		
	}
	     

	//Q.3 add both array in one array with sorting
	//  approach -1
	Integer[] arr1= {1,3,5};
	Integer[] arr2= {2,4,6};
	

Integer[] resultmap= Stream.of(arr1,arr2).flatMap(Arrays::stream).toArray(Integer[]::new);
Arrays.sort(resultmap);
System.out.println(Arrays.toString(resultmap));
	

//Q.3 add both array in one array with sorting
//approach -2
Integer[] arr3= {1,3,5};
Integer[] arr4= {2,4,6};




List<Integer> li1=Arrays.asList(arr3);
List<Integer> li2=Arrays.asList(arr4);

ArrayList<Integer> arrlist =new ArrayList<>();
arrlist.addAll(li1);
arrlist.addAll(li2);

System.out.println(arrlist);

Collections.sort(arrlist);

System.out.println(arrlist);






	
	

	
	
	
	
		
		
		
		
		

	}

}
