package com.example.java.keywords;

class StaticTest{
	
	// non-static method
	public void m1() {
		System.out.println("");
		
	}
	
	
	
	public int multiply(int a,int b) {
		
		int c=a*b;
		
		return c;
		
	}
	
	// static method
  static int add(int a,int b) {
		
		int c=a+b;
		
		return c;
		
	}
}







public class Java_static_and_non_static_Methods {
	
	public static void main(String[] args) {
		
		//creating new objects of above class
		
		StaticTest st=new StaticTest();
		
		 //call the nonstatic method
		  System.out.println("call the nonstatic method : " +  st.multiply(4, 8));
		
		
		
		  //call the static methods 
		  System.out.println("call the static methods  : " +  StaticTest.add(4, 8));
		

	}

}
