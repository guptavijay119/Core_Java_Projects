package com.example.corejava;

public class Exception_Chaining {

	public static void main(String[] args) {
		
		try{
			int a=10/0;
		}
		catch(ArithmeticException ae){
			
			//first way
			 Exception ex=new Exception("something went wrong:  "+ae);
			
			 //second way
			//throw new Exception("some thing went wrong ");
			
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			
			
		}
		
		
		

	}

}
