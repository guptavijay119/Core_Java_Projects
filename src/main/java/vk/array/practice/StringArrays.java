package vk.array.practice;

public class StringArrays {

	public static void main(String[] args) {
		
		String[] stringarr={"vijay","sonu","dinesh","manoj"};
		
		
		
		  // System.out.println(stringarr[2]);
	     //  System.out.println(stringarr[3]);
	     //  
	     //  System.err.println("-----------------------------------");
	       
		
       
       for (String string : stringarr) {
    	   
    	   if (string.equalsIgnoreCase("dinesh")) {
    		   System.out.println("there dinesh ");
    		   
    		   
		}
    	   else {
    		   System.out.println(string);
    	   }
    	  
		
	}
       
       
       
       
	}

}
