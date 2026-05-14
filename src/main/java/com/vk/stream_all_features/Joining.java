package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		
		
//		23. joining()
//
//		Joins strings.
		String result =
                Arrays.asList("Java","Spring","SQL")
                      .stream()
                      .collect(Collectors.joining(" "));
		
		
	

        System.out.println(result);
        
        
        
        System.out.println("-------------------------");
        
       // if list reverse
        
       List<String> result1 =
                Arrays.asList("Java","Spring","SQL");
       
       
       
       
       Collections.reverse(result1);
      
       
       System.out.println(result1);
       
       System.out.println("-------------------------");
       
    // if String reverse
       
       String s1="my name is vijay";
       
       List<String>  liststring=Arrays.asList(s1.split(" "));
       
       Collections.reverse(liststring);
       
       
       String collect = liststring.stream().collect(Collectors.joining(" "));
       
       System.out.println(collect);
       
       
       
		
		
		
	}

}
