package com.vk.oops;

public class Integer_Cache_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//✅ Integer Cache in Java

		//When you create an Integer using autoboxing 
		//or Integer.valueOf(), Java reuses cached objects for values:

	    //	-128 to 127
		
		//inside of cache range 
		Integer a=127;
		Integer b=127;
		System.out.println(a==b);
		
		
		
		     /*✅ Important Interview Point
	    	 ==
    		 Checks reference (memory address)
	     	 .equals() Checks value
     		 */
     	
     	
     	
     	
     	
     	
		    //outside of cache range 
				Integer a1=200;
				Integer b1=200;
				System.out.println(a1==b1);
				
				System.out.println(a1.equals(b1));
		

	}

}
