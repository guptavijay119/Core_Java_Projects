package com.vk.java_21_features;


record Employee(int id, String name) {
	
	
}

//Interview Answer
//Record Pattern की मदद से Record Object के fields को सीधे extract कर सकते हैं।
public class Record_Pttern {

	public static void main(String[] args) {
		
		Object obj = new Employee(101, "Vijay");

        if (obj instanceof Employee(int id, String name)) {
            System.out.println(id);
            System.out.println(name);
        }
		
		

	}

}
