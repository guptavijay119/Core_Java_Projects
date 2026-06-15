package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BCT_Test_15062026 {
	
	

     
     
     //   Input =“racecar”
    // Output = Non  Repeatable Element : e
    
	public static void main(String[] args) {
		
		String s="racecar";
       
		
		String s1 ="racecar";
        
      Map<String,Long> result1=Stream.of(s1.split(s1)).collect(Collectors.groupingBy(num1->num1,Collectors.counting()));
  
      System.out.println(result1);
  
  
  
  
  
	    
	    List<String> list=Arrays.asList(s.split(""));
	    
	  Map<Object, Long> result= list.stream().collect(Collectors.groupingBy(val->val,Collectors.counting()));
	  
	  
	  System.out.println(result);
	  
	  for(Entry<Object, Long> map:result.entrySet()){
	      
		  if(map.getValue()<=1) {
			  System.out.println("Non Repeate character:  "+map.getKey());
		  }
	      
	      
	  }
		
	}
	
    

}
