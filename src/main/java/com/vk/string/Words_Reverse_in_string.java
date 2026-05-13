package com.vk.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Words_Reverse_in_string {

	public static void main(String[] args) {
		String name = "My Name is Vijay Bahadur";

        List<String> list = Arrays.asList(name.split(" "));

       Collections.reverse(list);

        
        
       
        
        String result = list.stream() .collect(Collectors.joining(" "));
        System.out.println(result);
                           
      // Output - Bahadur Vijay is Name My
       
       for (String string : list) {
    	   System.out.print(string +" ");
		
	}

	}

}
