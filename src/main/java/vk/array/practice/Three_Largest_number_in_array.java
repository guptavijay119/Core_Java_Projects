package vk.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Three_Largest_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[]  lar= {10,20,40,90,20,80,100};
		
		List<Integer>  list =Arrays.asList(lar);
		
		
		Integer collect = list.stream().sorted(Collections.reverseOrder())
				.findFirst().get();
			
		System.out.println(collect);
		
			
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			List<Integer> collect1 = list.stream().sorted(Collections.reverseOrder()).
				distinct().limit(7).filter(x-> x >= 50).collect(Collectors.toList());
		
		
		
		
		
		System.out.println(collect1);
	 	
		

	}

}
