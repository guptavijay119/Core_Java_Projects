package com.vk.interview.question.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TCS_Test {

	

	public static void main(String[] args) {
		
	   //   Q.1	find the 6 th highest salary of database
		
		//  select * from salaries s  order by salary desc limit(1) offset(5);
	
		
		
		//Q.2	print chararcters frequency iteration sorting characters wise
		   String input = "I love my country";
	
		   // using stream api 
		   
		   List<String> strlist=Arrays.asList(input.split(""));
		   
		   Map<String, Long> collect = strlist.stream().collect(Collectors.groupingBy(str->str,Collectors.counting()));
		   System.out.println(collect);
		   
	
	
	//Q.3 what is the default size of the array
	  ArrayList a = new ArrayList();
	  
	
	  /* Interview Answer

	  Java 8+
	  new ArrayList() → Initial Capacity = 0
	  First element add होने पर Capacity = 10
	  Capacity full होने पर ArrayList 1.5x grow करता है।

	  Java 6/7 में अक्सर कहा जाता था कि default capacity 10 है, 
	  लेकिन Java 8 और बाद के versions में 
	  technically initial capacity 0 
	  होती है और first insertion पर 10 बनती है। 
	  
	   */
	
	
	}
	
	

}
