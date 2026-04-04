package com.vk.java8.features.practice;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		
		String name="vijay";
		
		String name1=null;
		String name2="";
		
		System.out.println(name.length());
		
		//null
		Optional<String>  opobj=Optional.ofNullable(name1);
		
		//blank
	    Optional<String> obj2=Optional.ofNullable(name2);
		
	    //null
		if(opobj.isPresent()) {
			System.out.println(name.length());	
		}
		else {
			System.out.println(" name is null");
			
		}
		
		
		
		//blank
		if(obj2.isPresent() && !obj2.get().isBlank() ) {
			System.out.println(name2.length());	
		}
		else {
			System.out.println(" name is null");
			
		}
		
		
		
		

		   

		   
		
		
		
		
		
		
	}
	

}
