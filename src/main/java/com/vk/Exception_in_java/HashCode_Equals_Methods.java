package com.vk.Exception_in_java;

 


  class Employee{
	  int id;
	  String name;
	  
	  
	  public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}



	  public Employee() {
		// TODO Auto-generated constructor stub
	}



	  @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	  
	  
	  
	  public int getId() {
		  return id;
	  }
	  public void setId(int id) {
		  this.id = id;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	
}


public class HashCode_Equals_Methods {

	public static void main(String[] args) {

		Employee e1=new Employee(101,"Vijay");
		Employee e2=new Employee(101,"Vijay");
		
		
		System.out.println("------------------ : "+e1.equals(e2));  //fasle
		
		System.out.println("-------------- : "+ e1.hashCode()); // 19986569
		System.out.println("-------------- : "+ e2.hashCode()); //294184992
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		
		
		
		
		
		

	}

}
