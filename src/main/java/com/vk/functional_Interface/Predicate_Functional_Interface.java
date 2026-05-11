package com.vk.functional_Interface;

import java.util.function.Predicate;

public class Predicate_Functional_Interface {

	public static void main(String[] args) {
		
		//4. Predicate<T> → test()
		
	    //	Purpose: Condition checking
		
		Predicate<Integer> p=num -> num > 18;
		System.out.println(p.test(20));
		

	}

}
