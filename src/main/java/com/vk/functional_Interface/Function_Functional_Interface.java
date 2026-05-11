package com.vk.functional_Interface;

import java.util.function.Function;

public class Function_Functional_Interface {

	public static void main(String[] args) {
		
		/* 
		 * 5. Function<T,R> → apply()
		Purpose: Takes input and returns output 
		*/
		
		Function<Integer, Integer> function=num -> num-3;
		
		System.out.println(function.apply(10));
		System.out.println(function.apply(20));
		
		
		

	}

}
