package com.vk.multithreading;

public class Yield extends Thread {
      
	 public void run() {
	        for(int i=1;i<=3;i++){
	            System.out.println(Thread.currentThread().getName());
	            Thread.yield();
	        }
	    }
	
	
	public static void main(String[] args) {
		
		Yield y1=new Yield();
		Yield y2=new Yield();
		
		y1.start();
		y2.start();
		
		
	

	}

}
