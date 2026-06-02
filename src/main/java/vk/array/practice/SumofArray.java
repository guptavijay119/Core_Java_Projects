package vk.array.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofArray {

	public static void main(String[] args) {
		
		
		
		int[] sumarr= {10,1,3,4,5,6};
	
	//	1-
	int a=	Arrays.stream(sumarr).sum();
	System.out.println(a);
	
	Arrays.sort(sumarr);
	System.out.println(Arrays.toString(sumarr));
	
	//2-
	Integer[] numbers = {10,20,30,40,80,90,50,40};
	
	int length = numbers.length;
	System.out.println(length);
	
	List<Integer> arrlist=Arrays.asList(numbers);
	      System.out.println(arrlist.size());    
	
	    long count = arrlist.stream().count();
	
	System.out.println(count);
	
	
	
		
		
		

	}

}
