package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOrOddNumberCheckingViaStreamAPI {

	public static void main(String[] args) {
		
		
         //way -1
	        int num =2;

	       Stream.of(num).map(x->x % 2==0 ? "even--" : "odd--").forEach(System.out::println);;
	       
	       
	       //way -2
	       
	         List<Integer> list=Arrays.asList(num);
	         list.stream().map(x-> x %2==0 ? "even":"odd").forEach(System.out ::println);
	       
	       
	        
	        String s1="India";
	        Map<String, Long> collect = Stream.of(s1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	        System.err.println(collect.toString());

	}

}
