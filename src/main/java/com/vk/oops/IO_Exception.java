package com.vk.oops;

import java.io.FileReader;
import java.io.IOException;

public class IO_Exception {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fileread=new FileReader("test.txt");
		fileread.read();
	
		

	}

}
