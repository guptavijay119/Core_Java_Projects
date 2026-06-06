package com.example.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class Test {
	private int empid;
	
	
	

	public static void main(String[] args) throws Exception {
		
		Runnable r=()->System.out.println("this is the functional interface");
		
		r.run();
		
		Callable<String> call=()->{
			
			
			return "this is callable inteface" ;
		};
		
		System.out.println(call.call());
		
		
		//we can reverse it word and character
           String s="Apple";
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		String s2="Apple Banana Cherry";
		
		//  o/p String s2="Cherry, Banana,Apple";
		
		List<String>  list=Arrays.asList(s2.split(" "));
		
		//Reverse the list
		Collections.reverse(list);
	//	Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println("str1.equals(str2): " + str1.equals(str2)); //true
		System.out.println("str1.equals(str3): " + str1.equals(str3));  //true
		System.out.println("this is the false : "+ str1==str3); //false

		
		
		
		final List<String> s1=Arrays.asList();
		
		ArrayList<String> obj1=new ArrayList<>();
		
		
		/*
		 * Integer a=100; Integer b=100;
		 * 
		 * System.out.println(a==b);
		 * 
		 * Integer c=100; Integer d=100; System.out.println(c==d);
		 */
		
		
		
		
		
		
		
		
		

	}

}
