package com.vk.test.collection;
import java.util.HashSet;
public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		
		/**  this only one digit dublicate 
		 * 
		          int[] arraylist= {1,2,3,4,4,5};
		          HashSet<Integer> newobj=new HashSet<>();
		          for(int num:arraylist) {
		        	  if(newobj.contains(num)) {
		        		  System.out.println("repeated number is :" +num);
		        		  
		        		  return;
		        	  }
		        	  newobj.add(num);
		          }
		          System.out.println("No duplicate found");
		          
		          	*/
		
		/* if the digit is dublicating multiple times than */
		int[] arraylist= {1,2,3,4,4,5,5};
        HashSet<Integer> newobj=new HashSet<>();
		for(int num : arraylist) {
		    if(newobj.contains(num)) {
		        System.out.println("repeated number is : " + num);
		    } else {
		        newobj.add(num);
		    }
		}
		
		
		

	}
	}

