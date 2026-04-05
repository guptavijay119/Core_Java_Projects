package com.vk.multithreading;


/*join() method makes one thread wait until another thread finishes execution.*/
public class Join extends Thread {

	 public void run() {
	        for(int i=1;i<=3;i++){
	            System.out.println("Child Thread");
	        }
	    }

	
	public static void main(String[] args) throws InterruptedException {
		
		Join t = new Join();
	        t.start();

	        t.join(); // main thread waits

	        System.out.println("Main thread");
		
		
		
		
		
		
		
		
		
		

	}

}
