package com.vk.multithreading;

public class Interrupt extends Thread {
	
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("dsjfagsdfgajsgdjh");
			
			
		} catch (InterruptedException e) {
       System.out.println("thread interrupted.....");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Interrupt itr=new Interrupt();
		itr.start();
		itr.run();
		
		itr.interrupt();
		
		
		

	}

}







