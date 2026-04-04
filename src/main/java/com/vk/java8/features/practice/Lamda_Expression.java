package com.vk.java8.features.practice;

public class Lamda_Expression implements MyInterface {

	public static void main(String[] args) {
		
		//normal java code example
		//Lamda_Expression newobj=new Lamda_Expression();
		//newobj.sayhellow();
		// TODO Auto-generated method stub
		

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


