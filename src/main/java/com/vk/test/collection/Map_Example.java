package com.vk.test.collection;

import java.util.*;
public class Map_Example {
	
	public static void main(String[] args) {
		Map<String,Integer>  map=new HashMap<>();
		 map.put("vijay",10000);
		 map.put("ajay", 20000);
		 map.put("mohan",40000);
		 map.put("vinod",60000);
		 map.put("kailash",80000);
		 map.put("aman",100000);
		  
		    for(Map.Entry<String,Integer> entry : map.entrySet()){
		        if(entry.getValue() >=60000){
		              System.out.println(entry.getKey() + " : " + entry.getValue());
		        }
			
			
			
			}
		 

	}

}
