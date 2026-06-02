package com.vk.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		// via string builder
		String str = "java";
		
		StringBuilder sb=new StringBuilder(str).reverse();
		
		System.out.println(sb);
		
		//via  stream api
	List<String> list=Arrays.asList(str.split(""));
	Collections.reverse(list);
	String result=	list.stream().collect(Collectors.joining(""));
	System.out.println(result);
	
	
	
	System.out.println("------------------01/06/2026---------------");
	//Reverse String Without Built-in Method
   	String str1="hello";
   	
   	char[] arr=str1.toCharArray();
   	
   	StringBuilder sb1=new StringBuilder(str1).reverse();
   	System.out.println(sb1);
   	
   	
   	for(int i=str1.length()-1; i>=0;i--) {
   		
   		System.out.print(arr[i]);
   	}
   	
   	System.out.println("------------------------------------------");
   	
   	//via stream api
   	String str2="vijay komal";
   	List<String>  list123=Arrays.asList(str2.split(""));
   	
   	Collections.reverse(list123);
   	    String collect = list123.stream().collect(Collectors.joining(""));
   	
   	
   	
   	System.out.println(collect);
   	
   	
  
	
	
	
	
		
		

	}

}
