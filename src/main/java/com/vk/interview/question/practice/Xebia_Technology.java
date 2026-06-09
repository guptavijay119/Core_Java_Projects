package com.vk.interview.question.practice;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Xebia_Technology {

	public static void main(String[] args) {
		
		
	//	Q.1  MAKE IT 'EVEN' AND 'ODD' GROUP FOR GIVEN INTEGER LIST
	List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
List<Integer> EVEN=	list.stream().filter(x->x%2==0).collect(Collectors.toList());

List<Integer> ODD=	list.stream().filter(x->x%3==0).collect(Collectors.toList());


System.out.println(EVEN);
System.out.println(ODD);


		
	
	
	
		   

	}
	
	
//	Q.2 
//	public class Employee {
//	    int id;
//	    String name;
//	 
//	    public Employee(int id, String name) {
//	        this.id = id;
//	        this.name = name;
//	    }
//	}
	 
//	HashSet<Employee> set = new HashSet<>();
//	set.add(new Employee(1, "Alice"));
//	set.add(new Employee(1, "Alice"));
//	 
//	System.out.println(set.size());
	
	
	
//	Q.3 
//	String s1="Vijay";
//	
//	String a = "hello"; 
//	String b = "hello";
//	System.out.println(a == b);   //true  
//	System.out.println(a.equals(b));//true
//	
//	
//	String a = "hello"; 
//	String b = new String("hello");
//	System.out.println(a == b);   //false
//	System.out.println(a.equals(b));  //true
//	 
//	String a = new String("hello"); 
//	String b = new String("hello"); 
//	System.out.println(a == b); //false   
//	System.out.println(a.equals(b)); //true
	 
	
//	Q.4
//	HashMap<Employee, String> map = new HashMap<>(); 
//	
//	Employee emp = new Employee(1, "Alice"); 
//	
//	map.put(emp, "Engineering"); 
//	    emp.name = "Bob";  // mutate the key! 
//	System.out.println(map.get(emp));
	
	
	
	
	
	
	

}
