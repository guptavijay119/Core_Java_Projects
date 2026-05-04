package com.vk.design_pattern;

public class Singleton_Pattern {
	//ceate static object
	private static Singleton_Pattern obj=new Singleton_Pattern();
	
	private Singleton_Pattern() {
		System.out.println("object created.....");
	}
	
	// Step 3: public method to access object
	public static Singleton_Pattern getinstance1() {
		
		return obj;
		
	}
	
	
	public void show() {
		System.out.println("show message");
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("hi this is design pattern java ");
		
		Singleton_Pattern s1=Singleton_Pattern.getinstance1();
		Singleton_Pattern s2=Singleton_Pattern.getinstance1();
		s1.show();
		
		System.out.println(s1==s2);
		   
		 /* 
		  * Singleton obj = one object only
				s1 ----|
				       |----> same object
				s2 ----|
		
		
		
		       Q: What is Singleton?
				A: Only one instance of class is created. 
		
		
		Definition:

			Singleton Pattern ensures only one object of a class is created in the whole application.

			Used when you need single shared instance like:

			Logger
			Database Connection
			Configuration Settings
			Cache   
		
		Real Life Example:

			🏦 Bank ATM Server

			Only one ATM server controls all transactions.
			If multiple servers create conflicts.

			So we keep one shared object. */
		
		
		
		
		

	}

}
