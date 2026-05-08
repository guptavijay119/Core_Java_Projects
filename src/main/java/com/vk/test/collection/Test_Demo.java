package com.vk.test.collection;

import java.util.List;
import java.util.stream.IntStream;




public class Test_Demo {

	public static void main(String[] args) {
		
		/*
		 *  given list of employees as below
		List<Employee> employees = List.of(
		new Employee("A", "IT", 50000),
		new Employee("B", "HR", 40000),
		new Employee("C", "IT", 45000),
		new Employee("D", "HR", 30000),
		new Employee("E", "Finance", 35000));
		 
		for each department increase salary by 
		10% if salary <35000
		5% if salary >=35000  
		
		*/
		
	

		        String[] names = {"A","B","C","D","E"};
		        String[] dept = {"IT","HR","IT","HR","Finance"};
		        double[] salary = {50000,40000,45000,30000,35000};

		        for (int i = 0; i < salary.length; i++) {
		            if (salary[i] < 35000) {
		                salary[i] = salary[i] + (salary[i] * 10 / 100);
		            } else {
		                salary[i] = salary[i] + (salary[i] * 5 / 100);
		            }
		        }
		        System.out.println("-------------------------------------");
		        
		        String[] names1 = {"A","B","C","D","E"};
		        String[] dept1 = {"IT","HR","IT","HR","Finance"};
		        double[] salary1 = {50000,40000,45000,30000,35000};

		        for (int i = 0; i < salary1.length; i++) {
		            if (salary1[i] < 35000) {
		                salary1[i] = salary1[i] + (salary1[i] * 10 / 100);
		            } else {
		                salary1[i] = salary1[i] + (salary1[i] * 5 / 100);
		            }
		        }
		  
		        
		     //   IntStream.range(0, salary1.length).forEach(
		        //		i-> System.out.println(names1[i]+ " "+ dept[i] + " "+ salary[i]));
		        
		        		//);
		        
		       

		        for (int i = 0; i < salary.length; i++) {
		            System.out.println(names[i] + " " + dept[i] + " " + salary[i]);
		        }
	
		
		
		
		
		
		
		
		

	}

}
