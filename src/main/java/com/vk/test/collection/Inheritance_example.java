package com.vk.test.collection;

   class A {
	public void show() {
		System.out.println("A");
		}
	}
   
	class B extends A {
	public void show() {
		
		System.out.println("B"); 
		}
	}



public class Inheritance_example {

	public static void main(String[] args) {
		
		A obj =new B();
		
		obj.show();
		
		System.out.println("------------------------------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		 
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //TRUE
		 
		String s3 = "Java1";
		String s4 = "Java1";
		 
		System.out.println(s3 == s4);  //true
		System.out.println(s3.equals(s4)); //true
		 
		String s5 = new String("Java2");
		String s6 = "Java2";
		 
		System.out.println(s5 == s6); //false
		System.out.println(s5.equals(s6)); //TRUE
		
		
		
		
		

	}

}
