package com.vk.multithreading;

import java.security.PublicKey;

public class Start extends Thread {
	

	public static void main(String[] args) {
		
		Start start1=new Start();
		start1.start();
	}
	
	public void run() {
		System.out.println("this is starting run methods");
		
	}
	
public void m1() {
		
		System.out.println("this is m1 methods starting.....");
	}

}
