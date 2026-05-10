package com.vk.loop;

public class For_Loop {

	public static void main(String[] args) {
	
		
	//	print 1 to 10 number
		for(int a=0; a<=10; a++) {
			
			System.out.println(a);
			
		}
		
	//	Print Even Numbers
		//This example prints even values between 0 and 10:
		
		System.out.println("This example prints even values between 0 and 10:");
		for(int i=0; i<=10; i=i+2) {
			System.out.println(i);
			
		}
		
		
   //		Print odd Numbers
			//This example prints odd values between 0 and 10:
			
			System.out.println("This example prints odd values between 0 and 10:");
			for(int i=0; i<=10; i=i+3) {
				System.out.println(i);
				
			}
			
		//	Sum of Numbers
			//This example calculates the sum of numbers from 1 to 5:
			
			int sum=0;
			
			for(int i=1;  i<=5;i++) {
				
				sum=sum+i;
				
			}
			
			System.out.println("sum : "+sum);
			
			
			
			//Countdown
			//This example prints a countdown from 5 to 1:
			
			System.out.println("This example prints a countdown from 5 to 1:");
			for(int a=5; a >= 1;a--) {
				System.out.println(a);
				
			}
			
			
			
		

	}

}
