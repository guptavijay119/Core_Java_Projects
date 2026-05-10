package com.vk.Exception_in_java;

public class Exception_Example_with_try_catch {
	
	//throw Keyword

	//Used to manually throw an exception

	
	//throws Keyword

	//Used to declare exceptions in method signature.
	
	public static void main(String[] args) throws ArithmeticException  {
		try {
			System.out.println("this is the try block");
			int a=20;
			int b=a/0;
			if(a==b) {
				throw new ArithmeticException("this is the arithmatic exception");
			}
			
			System.exit(0);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("this is the catch block");
		}
		
		
		finally {
		System.out.println("this is the finally block");
		}

	}

}
