package com.example.corejava;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first way to print 1 to 10 numbers.
//		  System.out.println(1);
//		  System.out.println(2);
//		  System.out.println(3);
//		  System.out.println(4);
//          System.out.println(5);
//          System.out.println(6);
//          System.out.println(7);
//          System.out.println(8);
//          System.out.println(9);
//          System.out.println(10);
          
        //second way to print 1 to 10 numbers.
          int i=0;
          for(i=0; i<=10;i++) {
        	  
        	  if (i >= 3 && i <= 5) { // Execute the inner loop only for i = 3, 4, 5
        	        for (int j = 3; j <= 5; j++) { // Use a different variable for the inner loop
        	            System.out.println("This is inner for loop: " + j);
        	        }
        	    }
        	  
        	  
        	  
        	  
        	  if(i==7) {
        		//continue;
        		  break;
        	  }
        	  else {
        	  System.out.println(i);
        	  }
        	  
          }
          
         

	}

}
