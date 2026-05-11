package com.vk.functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
   int id;
   String name;
   
   
   
   
	
	
	
	public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}















	@Override
	public int compareTo(Employee e) {
		
		
		// Ascending sorting by id
		return this.id - e.id;
	}
	
	
	
}


public class Comparable_Functional_Interface {

	public static void main(String[] args) {
		
		/*Definition

		Comparable is a predefined functional interface in Java 
		used for natural sorting of objects.

		It is present in the java.lang package.

		It contains only one abstract method: 
		
		compareTo(Object obj)
		
		Using Comparable, we can sort objects in:

			
			Ascending order
			Descending order

			Examples:

			Sort employee by id
			Sort student by marks
			Sort product by price 
		
		
		
		Real-Time Interview Answer

		Comparable interface is used for natural sorting in Java.
		It is available in the java.lang package and contains one 
		abstract method compareTo().
		By implementing Comparable, objects can be sorted 
		using Collections.sort() method.
		
		*/
		
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(103, "vijay"));
		list.add(new Employee(102, "ajay"));
		list.add(new Employee(101, "mohan"));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		for (Employee employee : list) {
			System.out.println(employee.id + "  "+  employee.name);
			
		}
		
		
		
		
		
		
		

	}

}
