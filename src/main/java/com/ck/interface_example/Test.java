package com.ck.interface_example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		/*I/p - My Name is Vijay Bahadur
		 
		Output - Bahadur Vijay is Name My
		  */
		
		String name="My Name is Vijay Bahadur";
		
		StringBuilder sb=new StringBuilder(name);
		
		StringBuilder s1=sb.reverse();  // reverse the characters 
		System.out.println(s1); 
		
		System.out.println("-------------------------------------------------");
		
		
		String name1 = "My Name is Vijay Bahadur";

        String[] words = name1.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i] + " ");
        }
        
        
		

		
		
		
		System.out.println("---------------------------------");
        //	10,20,30,40,50,60
		 
		//	15,20,25,30
			 
	   //  o/p=	10,15,20,25,30,40,50,60
	
		
		List<Integer> set=Arrays.asList(10,20,30,40,50,60,15,20,25,30);
		TreeSet<Integer> treeset=new TreeSet(set);
		System.out.println("---------------------------------");
		System.out.println(treeset);
		

//		
		
		
		
		
		
		
		
		
		
		

	}

}
