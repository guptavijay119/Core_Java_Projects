package com.vk.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Words_Reverse_in_string_using_Stream_API {

	public static void main(String[] args) {
		String name = "My Name is Vijay Bahadur";
		
		List<String> list=Arrays.asList(name.split(" "));
		
		System.out.println(list);
		Collections.reverse(list);
		
		String  result= list.stream().collect(Collectors.joining(" "));
		
		System.out.println(result);
		

	}

}
