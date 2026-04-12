package com.vk.oops;

public class Polymorphism_example_method_overloading {
	int add(int a,int b ) {
		System.out.println(a+b);
		
		return a+b;
		
	}
	
	double add(double a ,double b) {
		
		System.out.println(a+b);
		return a+b;
		
	}

	public static void main(String[] args) {
		
		Polymorphism_example_method_overloading pol=new Polymorphism_example_method_overloading();
		pol.add(5, 6);
		//pol.add(5, 6);
		
		

	}

}
