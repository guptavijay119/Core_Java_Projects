package com.vk.loop;

public class For_each_loop {

	public static void main(String[] args) {
		
		/* In Java, the for-each loop 
		(also called the enhanced for loop) is used when you want
		to iterate over a collection or 
		array without worrying about indexes.
		
		
		
		for (type variableName : arrayName) {
			  // code block to be executed
			}
		  */
		
		
		String[] arraysString= {"vijay","manoj","dinesh","vijay"};
		
		
		System.out.println(arraysString[1]+ ' '+ arraysString[2] + ' '+ arraysString[0]);
		System.out.println("----------------------------------------------------------");
		
		for (String string : arraysString) {
			if(string.contains("vijay")) {
				System.out.println("vijay---------------------"+string.length());
			}
			else {
				System.out.println(string);
			}
			
			
		}
		
		

	}

}
