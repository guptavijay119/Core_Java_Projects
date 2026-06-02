package vk.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Largest_Number_in_Array {

	public static void main(String[] args) {
		Integer[] largest= {10,20,30,40,80,90,50,40};
		
		List<Integer> list=Arrays.asList(largest);
		
		//find largest number
	  Integer integer = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
	  System.out.println(integer);
	  
	  //find 2nd largest number
	  Integer integer1 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	  System.out.println(integer1);
	  
	//  find the first lowest
	Integer lowval= list.stream().sorted().findFirst().get();
	System.out.println(lowval);
		
		
		
	  
	  
		
		
    
		
		

	}

}
