package com.vk.functional_Interface;

import java.util.concurrent.Callable;

public class Callable_Functional_Interface {

	public static void main(String[] args) throws Exception {
		
	//	2. Callable → call()
		
   //   Purpose: Returns result
		
		Callable<Integer> callablevar=()->{
			
			
			return 100;
			
		};
		
     Callable<String> callablevarstring=()->{
			
			
			return "vijay this is string callable functional interface";
			
		};
		
		System.out.println(callablevar.call());
		System.out.println(callablevarstring.call());
		
	

	}

}
