package com.vk.functional_Interface;

public class Runnable_Functional_Interface {

	public static void main(String[] args) {
		
		//1. Runnable → run()
		
		//Purpose: Thread execution
		
		Runnable r=() ->{
			System.out.println("thread execution ---");
			
			
		};
		
		Thread t=new Thread(r);
		t.start();
		

		
		
		
		
	}

}
