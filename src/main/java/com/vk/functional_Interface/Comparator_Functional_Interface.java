package com.vk.functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Functional_Interface {

	public static void main(String[] args) {
		
	    //	3. Comparator → compare()
		
		//Purpose: Sorting
		
		 /*3. How compare() Works

		Comparator returns:

		Return Value	  Meaning
		Negative	      a comes before b
		Positive	      b comes before a
		Zero	          Both are equal */
		
		List<Integer> list =Arrays.asList(5,2,8,1,10,0);
		
		Comparator<Integer> comp=(a,b)->(a-b);
		
		Collections.sort(list,comp);
			
		System.out.println(list);
		
		
		

	}

}
