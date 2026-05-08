package com.vk.test.collection;

import java.util.*;

//HashMap is a class in Java Collection Framework that stores data in key-value pairs.

		//Each key must be unique
		//Values can be duplicate
		//It is part of java.util
		//It uses Hashing internally for fast data storage and retrieval

public class HashMap_Example {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(101, "vijay");
	    map.put(102, "ajay");
	    System.out.println(map);
	    
	     
	    
	    // When we do:
	    	
	    	map.put(101, "vijay");
	    	
	   //HashMap internally performs these steps:
	    	
	    	
	    	
	    	//Step 1: Hash Calculation
	    	
	    	Integer key = 101;
	    	key.hashCode();
	    	
	    	
	    	//Step 2: Index Calculation
	    	//HashMap converts hashcode into an array index.

	    	//Formula:

	    	//Index=hashCodemodArray Size

	         //	Example:
	    	//	101 % 16 = 5
	     //101 % 16 = 5
	    //	So data will be stored at index 5.
	    	
	    
	    	/*Step 3: Store Entry in Bucket

	    	HashMap internally has an array called bucket array.

	    	At index 5: */
	    	
	    	//bucket[5] = (101, "Vijay")
	    	
	    	
	    	/*Step 4: Collision Handling

	    	Suppose another key gives same index.

	    	Example: */
	    	
	    	
	    	
	    	
		
		
        
		
	}

}
