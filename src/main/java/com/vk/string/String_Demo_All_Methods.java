package com.vk.string;

public class String_Demo_All_Methods {

	public static void main(String[] args) {
		    String str = "Java Programming";
		    System.out.println(str.charAt(0));
		    System.out.println(str.charAt(0));

	        System.out.println(str.length());
	        System.out.println(str.trim());
	        System.out.println(str.toUpperCase());
	        System.out.println(str.substring(1,5));
	        System.out.println(str.equalsIgnoreCase("JAVA PROGRAMMINGd"));
	        System.out.println(str.replace("Java", "Core Java---"));
	        
	        String s1 = "java";
	        String s2 = "java";

	        System.out.println(s1 == s2);       // reference
	        System.out.println(s1.equals(s2));  // value
	}

}
