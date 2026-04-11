package com.vk.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exception {

	public static void main(String[] args)  throws FileNotFoundException  {
	
		
		/*
		 * if we are not adding on the methods throws FileNotFoundException WE WILL GET
		 * COMPILE TIME ERROR
		 */
		// java.io.FileNotFoundException;
			FileReader fileread=new FileReader("test.txt");
			System.out.println("file not found exception:");
			
			
			
			

	}

}
