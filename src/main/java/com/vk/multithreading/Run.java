package com.vk.multithreading;

import org.springframework.beans.factory.annotation.Autowired;

public class Run extends Thread {
	
	//@Autowired 
	//private Start start;
	Start start=new Start();
		
	public static void main(String[] args) {
	
		
		Run r1=new Run();
		r1.start.m1();
		
		
//		---------------
		
		r1.start.run();

	}

}
