package com.vk.java8.features.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lamda_Expression implements MyInterface {

	public static void main(String[] args) {
		
		//normal java code example
		//Lamda_Expression newobj=new Lamda_Expression();
		//newobj.sayhellow();
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		
		Integer[] arr= {10,2,3,4,5,4,7,8,9,10};
		Stream<Integer> filtereven = Stream.of(arr).filter(x -> x %2==0);
		
		filtereven.forEach(x -> System.out.println(x));
		System.out.println("--------------------------");
        
		Stream<Integer> filterodd = Stream.of(arr).filter(x -> x % 2!=0);
		filterodd.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
		

		/* lambda example */
		Lamda_Expression obj1=new Lamda_Expression();
		MyInterface obj=()-> obj1.sayhellow();
		
		obj.sayhellow();
		
		

	}

	@Override
	public void sayhellow() {
		
		System.out.println("hello java by by dsafhasghfagsjhgahj");
	}

}  // end class


