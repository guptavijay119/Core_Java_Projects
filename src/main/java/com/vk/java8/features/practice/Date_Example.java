package com.vk.java8.features.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Example {
	
	
	public static void main(String[] args) {
		 LocalDate  todaydate=LocalDate.now();
		 todaydate.datesUntil(todaydate);
		 
		     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			String formattedDate = todaydate.format(formatter);
		 
		 System.out.println("today date is :" + ' '+formattedDate);
		 
		
		
	}

}
