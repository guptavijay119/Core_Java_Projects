package com.vk.interview.question.practice;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Bahvan_Cyber_Tech {

	public static void main(String[] args) {

		
	//	Q.1 print missing value
		Integer[] arr= {1,2,4,6,7};

		
		HashSet<Integer> hs=new HashSet<>(Arrays.asList(arr));
		
		//System.out.println(hs);
		
		IntStream.rangeClosed(1, 7).filter(x->!hs.contains(x)).forEach(System.out::println);
		

		
		
		
		
		

	}

}
