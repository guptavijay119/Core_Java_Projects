package com.example.corejava;

import java.util.*;

 class Test1 {
    public static void main(String[] args) {
    	
    	
    	
        Map<Integer, String> mapSet = new HashMap<>();
        mapSet.put	(000, "Dileep");
        mapSet.put(000, "Ram");
        mapSet.put(111, "Shyam");
        mapSet.put(222, "Santosh");
        mapSet.put(333, "Tarun"); // "Dileep" is overwritten
        mapSet.put(444, "Sanjeev");
        mapSet.put(444, "Sanjeev");

        // Sort values alphabetically
        List<String> sortedValues = new ArrayList<>(mapSet.values());
        Collections.sort(sortedValues);

        // Print sorted values
        System.out.println("Sorted Values: " + sortedValues);
    }
    
}


 public class BasicTest {
     public static void main(String[] args) {
         List<Integer> arrays = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

         for (int i = 0; i < arrays.size(); i++) {
             int value = arrays.get(i);
             if (value == 45) {
                 System.out.println("Index " + i + ": this is 45 value");
             } else if (value == 56) {
                 System.out.println("Index " + i + ": this is 56 value");
             }
         }
     }
 
 }
 
 
 

        	
        	
        	//arrays= 45, 12, 56, 15, 24, 75, 31, 89
        	
        	//System.out.println(arrays.stream());
        	
//        	String a= "JAVA DEVELOPER";
//        	StringBuilder sb=new StringBuilder();
//        	System.out.println(sb.charAt(0));
//        	
//        
        	
        	
      // }
        
   // }
//            Map<Integer, String> mapSet = new HashMap<>();
//            mapSet.put(000, "Ram");
//            mapSet.put(111, "Shyam");
//            mapSet.put(222, "Santosh");
//            mapSet.put(333, "Tarun"); // "Dileep" is overwritten
//            mapSet.put(444, "Sanjeev");
//
//            // Sort values alphabetically
//            List<String> sortedValues = new ArrayList<>(mapSet.values());
//            Collections.sort(sortedValues);
//
//            // Print sorted values
//            System.out.println("Sorted Values: " + sortedValues);
        
    
    
    
    
    
    
    
    
    



