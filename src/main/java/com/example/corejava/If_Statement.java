package com.example.corejava;

public class If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var a=10;
		var b=20;
		var c=a+b;
		System.out.println("c ="+c);
		
		if(a==20) {
			System.out.println("this is the a  value.");
		}
		else if(b==30){
			System.out.println("this is the b value.");
		}
		
		else
		{
			System.out.println("this is for nothing..");	
		}
		
//		this is for switch statement
		
		int day=0;
		
		switch (day) {
		case 1: {
			System.out.println("Monday");
	        break;
		}
		
		case 2: {
			System.out.println("Tuesday");
	        break;
		}
		case 3: {
			System.out.println("wednesday");
	        break;
		}
		case 4: {
			System.out.println("Thursday");
	        break;
		}
		case 5: {
			System.out.println("Friday");
	        break;
		}
		
		case 6: {
			System.out.println("saturday");
	        break;
		}
		
		case 0: {
			System.out.println("sunday");
	        break;
		}
		
		
		
		

		}
		
			
		}

	

}
