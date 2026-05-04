package com.vk.test.collection;

public class Method_Overloading {
	
	
	
	
	public void m1(Double a,Double b) {
		System.out.println("Double methods : "  + a +','+ b );
		
	}
	
	public void m1(int a,int b) {
		System.out.println("Integer methods : " + a +','+ b);
		
	}
	
	public void m1(int a,int b,int c) {
		System.out.println("Integer methods : " + a +','+ b);
		
	}
	

	public static void main(String[] args) {
		
		Method_Overloading mo=new Method_Overloading();
		mo.m1(1,2);
		

		
		

	}

}
