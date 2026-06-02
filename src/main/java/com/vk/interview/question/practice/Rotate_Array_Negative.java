package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate_Array_Negative {

	public static void main(String[] args) {
		
		Integer[] array= {1,2,3,4,5,6};
		int k= -5;
		
		
		List<Integer> list=Arrays.asList(array);
		
		Collections.rotate(list,k);
		System.out.println(list);
		
		
		String s1 = "Java";
		String s2 = "Java";
		//String s2 = new String("Java");
		
		
		s1.equals(s2);//returns true
	    System.out.println(s1==s2);	 //false
		
		
		
		
		

	}

}
