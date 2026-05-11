package com.vk.functional_Interface;

import java.util.function.Supplier;

public class Supplier_Functional_Interface {

	public static void main(String[] args) {
		
		/* 7. Supplier<T> → get()
		      Purpose: Supplies value   
		
		Supplier<T> is a predefined functional interface in Java used to 
		supply/provide values.

          It does not take any input but returns a value.

           It contains one abstract method:
		
		*/
		
		
		 Supplier<String> sup=()-> "Vijay ji Mumbai";
		 
		String su=   sup.get();
		System.out.println(su);
			 
	
		

	}

}
