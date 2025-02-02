package com.example.corejava;
import java.time.LocalDate; // import the LocalDate class

public class LocalDateCurrentDatePrint{
   
		  
  public static void main(String[] args) {
  
	  LocalDate obj=LocalDate.now();
	  EmployeeBasicDetails newempbasicobj=new EmployeeBasicDetails();
	// Assuming getDob() returns a String, parse it to LocalDate
      LocalDate dobString = newempbasicobj.getDob(); // Example: "1990-05-15"
      System.out.println(newempbasicobj.getName());
      System.out.println(newempbasicobj.getAddress());
     
     
  System.out.println(dobString);
  
   System.out.println(obj);
  }


}