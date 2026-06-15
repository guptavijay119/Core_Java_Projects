package vk.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arrays_sort {

	public static void main(String[] args) {
	
		Integer[]  arrays= {0,1,0,1,0,1,0,1,0,0,1};
		  
		
		
		   Arrays.sort(arrays);
		  
		   Integer[] rotate= {1,2,3,4,5,6};
		   List<Integer> list=Arrays.asList(rotate);
		   
		   
		   Collections.rotate(list,2);
		   System.out.println(list);
		   
		  // | Statement                                     | Result              |
		  // | --------------------------------------------- | ------------------- |
		 //  | `System.out.println(arrays)`                  | Memory reference    |
		 //  | `System.out.println(Arrays.toString(arrays))` | Actual array values |

		  System.out.println(Arrays.toString(arrays));
		  
		  
		  
		  
		  
		
		
		
		

	}

}
