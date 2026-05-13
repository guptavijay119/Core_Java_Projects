package com.vk.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Words_Reverse_in_string_using_logic {

	public static void main(String[] args) {
		String name = "My Name is Vijay Bahadur";

       List<String> list = Arrays.asList(name.split(" "));

       Collections.reverse(list);
       System.out.println(list);
       
       
      // convert list in to string
       String s2=String.join(" ", list);
       System.out.println(s2);
       
       
        
                           


	}

}
