package com.vk.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words_Reverse_in_string_using_logic {

	public static void main(String[] args) {
		String name = "My Name is Vijay Bahadur";

       List<String> list = Arrays.asList(name.split(" "));

       Collections.reverse(list);
       System.out.println(list);
       
       
      // convert list in to string
       String s2=String.join(" ", list);
       System.out.println(s2);
       
       
       // ===============================
    	        // 1. Reverse EACH WORD in String
    	        // ===============================
                String sentence1 = "sachin";
    	        
                String sentence = "my name is vijay ";
    	        
    	       StringBuilder sb=new StringBuilder(sentence1);
    	       sb.reverse();
    	       System.out.println(sb);
    	       
    	       
    	       
    	       System.out.println("-------------------------");
    	       
    	       List<String>  list1=Arrays.asList(sentence.split(" "));
    	       
    	       Collections.reverse(list1);
    	     	  
    	    // System.out.println(size);
    	       
             String result=  list1.stream().collect(Collectors.joining(" "));
    
            System.out.println(result);
            
            
           
      
    	        
    
    
    
    	       
    	       
    	      
    	        
    	        

    	      
    	        
    	        
    	        
    	        
    	        
    	        
       
       
       
        
                           


	}

}
