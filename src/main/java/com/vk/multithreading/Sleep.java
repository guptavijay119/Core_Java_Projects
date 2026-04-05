package com.vk.multithreading;


/*Definition
sleep() method pauses the current thread for a specified time (milliseconds).*/

public class Sleep extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		Sleep s1=new Sleep();
		s1.m2();
	}
	
	
	
	//dummy methods
	public void m2() throws InterruptedException {
		
		//int a=10;
		int b=20;
		
		for(int i=0; i<=b;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);	
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			finally {
				System.out.println("executed block always .......");
				
			}
			
			
			
		}
		
		
	}
	
	
	
	
	

}
