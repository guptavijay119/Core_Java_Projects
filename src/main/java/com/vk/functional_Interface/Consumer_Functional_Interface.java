package com.vk.functional_Interface;

import java.util.function.Consumer;

public class Consumer_Functional_Interface {

	public static void main(String[] args) {
		
		/* 6. Consumer<T> → accept()
		
	    	Purpose: Consumes value 
		
		Consumer<T> is a predefined functional interface in Java used to consume data.

		It takes input but does not return anything.

		It contains one abstract method:  */
		
		Consumer<String> consumer=name->{
			
			System.out.println(name.toCharArray());
			
		};
		consumer.accept("ajay");
		System.out.println("---------------");
		consumer.accept("vijay bahadur gupta");
		
		
		
		
		

	}

}
