package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LTM_test {

	public static void main(String[] args) {
		
		
		
		  List<String> list=Arrays.asList("Vijay","ajay","bahadur",null,"");
		 		  
		 Optional<String> result= list.stream().map(String::toUpperCase).findFirst();
		 System.out.println(result);
		 
		 
		 
		// if null is not there 
		 List<String> list2=Arrays.asList("Vijay","ajay","bahadur");
		 
		String  result2= list2.stream().map(String::toLowerCase).findFirst().get();
		 
		 System.out.println(result2);
		  
		  
		
		
		

	}

}
