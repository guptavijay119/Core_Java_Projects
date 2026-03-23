package com.vk.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExample {

	public static void main(String[] args) {
		
		/*
		 * 1️⃣ ArrayList Uses dynamic array Fast for reading Slow for insert/delete in
		 * middle
		 */
		
		 List<String> list = new ArrayList<>();
		 list.add("vijay");
		 list.add("aman");
		 list.add("suresh");
		 System.out.println(list);
		
		 
//		 List<String> list1 = new LinkedList<>();
//
//	        list1.add("Apple");
//	        list1.add("Banana");
//	        list1.add("Mango");
//
//	        System.out.println(list1);
		

	}

}
