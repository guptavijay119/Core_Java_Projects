package com.example.corejava;

public class AutoBoxing_Class {
	
	/*Auto-boxing and Un-boxing in Java
	  1. Auto-boxing

	 Auto-boxing means converting a primitive data type into its corresponding Wrapper
	 class object automatically by Java compiler.

     Primitive → Wrapper


| Primitive | Wrapper Class |
| --------- | ------------- |
| int       | Integer       |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       | */


	public static void main(String[] args) {
		
		int a=20;
		
		
		Integer b=a;  // this is auto boxing
		
		System.out.println(b);
	}

}
