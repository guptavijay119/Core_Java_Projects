package com.vk.stream_all_features;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		//1. filter()
		//Purpose

		//Filters data based on condition.
		
		List<Integer> list =
                Arrays.asList(10,20,30,40,50);

        list.stream().filter(x-> x >=18).forEach(System.out ::println);
		
		
		
	}

	}


