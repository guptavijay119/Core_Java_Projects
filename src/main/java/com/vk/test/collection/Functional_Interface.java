package com.vk.test.collection;

public class Functional_Interface {
     
	  public void m1() {
		  System.out.println("this is run method.");
	  }
	
	
	public static void main(String[] args) {
		
		Functional_Interface f1=new Functional_Interface();
		
		Thread t=new Thread();
		t.start();
		f1.m1();

	}

}
