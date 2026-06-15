package com.example.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice_Coding {
	public static void main(String [] args) {
		
		
		//Q. (1.) Reverse String without String Builder
		String x="Anita";
		
		List<String> list=Arrays.asList(x.split(""));
		Collections.reverse(list);
		
	   String collect=	list.stream().collect(Collectors.joining(""));
		
		System.out.println(collect);
		
		//Q. (2.) CHECK ANARGRAM
		
		String s1="listen";
		String s2="silent";
		
	    char[] s1arr=s1.toCharArray();
	    char[] s2arr= s2.toCharArray();
	    
	    Arrays.sort(s1arr);
	    Arrays.sort(s2arr);
	    
	    if (Arrays.equals(s1arr, s2arr)) {
	    	System.out.println("this is anargram words...");
			
		}
	    else {
	    	
	    	
	    	System.out.println("this is not anargram words...");
	    }
	    
	  //Q. (3.)     find the duplicate element in array
	    Integer[] arr= {10,20,10,30,40,10,2,20,3,30,50,60,50};
	    
	         List<Integer> listduplicate=Arrays.asList(arr);
	    
	 
			Map<Integer, Long> collect2 = listduplicate.stream().collect(Collectors.groupingBy(num -> num,Collectors.counting()));
			
			System.out.println(collect2);
			
			for (Map.Entry<Integer, Long> maplist :collect2.entrySet()) {
				
				if(maplist.getValue()>1) {
				System.out.println(maplist.getKey());	
				}
				
				
				
				
			}
			
			
			
			
			
			
	    	
	    

		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
