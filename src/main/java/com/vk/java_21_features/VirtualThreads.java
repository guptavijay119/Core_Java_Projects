package com.vk.java_21_features;

public class VirtualThreads {

	public static void main(String[] args) {
		
		//Use Case: Microservices, High Concurrent Applications
		
		//Without Virtual Thread
		//Problem
		//Normal thread ज्यादा memory लेते हैं।
		 Thread thread = new Thread(() -> {
	            System.out.println("Normal Thread");
	        });

	        thread.start();
	        
	        
	        //With Virtual Thread
	      //  Interview Answer
	       // Virtual Threads lightweight threads हैं जो JVM द्वारा manage किए जाते हैं और
	        //high concurrency applications में उपयोगी होते हैं।
			Thread virtualThread = Thread.startVirtualThread(() -> {
				System.out.println("Virtual Thread");
			});
			
			 try {
				 virtualThread.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			
			
		
		
		
		
	}

}
