package com.vk.oops;

public class Unchecked_exception {

	public static void main(String[] args) {
		
		int a=10/0; // ArithmeticException
		//👉 Compiles fine, but crashes at runtime
		//int b=0;
		
		Integer[] val1= {1,2,3,4,5};
		
		System.out.println(val1[7]);  // array index out of bound exception
		
		String a1=null;
		a1.getBytes();  // null pointer exception
		System.out.println(a1);
	}

}
