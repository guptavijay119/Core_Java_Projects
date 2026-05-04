package com.vk.java8.features.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Date_Example {
	
	
	public static void main(String[] args) {
		
		LocalDate datevar=LocalDate.now();
		System.out.println("today date:"+datevar);
		
		
		//String S1="vijay";
		
		
		
		List<String> listofitem=Arrays.asList("vijay","ajay","mohan");
		System.out.println(listofitem);
		
		
		
		
		List<String> listofitem1=Arrays.asList("khushi");
		//Optional<List<String>> oc=Optional.ofNullable(listofitem1);
		System.out.println(listofitem1);
	
		
		
		
		
		
	//	 LocalDate  todaydate=LocalDate.now();
//		 todaydate.datesUntil(todaydate);
//		 
//		     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//			String formattedDate = todaydate.format(formatter);
//		 
//		 System.out.println("today date is :" + ' '+formattedDate);
		 
		
		
	}

}
