package vk.array.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Move_Negative_Numbers_Beginning_Using_Stream_API {

	public static void main(String[] args) {
		// int arr[] = {2, -3, 5, -1, 6, -7, 8, -9};
		 
		 Integer[] arr = {2,4,-8,-9,3,1,-6};
		 
		List<Integer> list=Arrays.asList(arr);
		
		
		
		System.out.println(list);
		
		  List<Integer> results=  Stream.concat(
		    		list.stream().filter(x-> x < 0 ),
		    		list.stream().filter(x-> x >=0)
		    		).collect(Collectors.toList());
		
		System.out.println(results.toString());
		
	System.out.println("--------------------------------------");	
		
		   Integer[] arr1 = {2,4,6,-99,-101 ,3,1,-106};
		    List<Integer> list1=Arrays.asList(arr1);
		    
		    List<Integer> collect = Stream.concat(
		    		
		    		list1.stream().filter(x-> x < 0),
		    		
		    		list1.stream().filter(x-> x >=0)).collect(Collectors.toList());
		    
		    System.out.println("dsfgasgfdagsjhdgahgs"+collect);
		    
		    
		    
		    
		    
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
       //  list1.stream().filter(x -> x < 5).forEach(System.out::println);




		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		
		

	}

}
