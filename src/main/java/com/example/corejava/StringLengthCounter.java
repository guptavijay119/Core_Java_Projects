package com.example.corejava;

import java.util.ArrayList;
import java.util.Arrays;

//public class StringLengthCounter {
//
//    public static void main(String[] args) {
//
//        List<String> names = new ArrayList<>();
//        names.add("vijay");
//        names.add("kamalesh");
//        names.add("ravi");
//        names.add("abhishek");
//
//        // Sort by length in descending order
//        names.sort(Comparator.comparingInt(String::length).reversed());
//
//        // Print sorted names and their lengths
//        for (String name : names) {
//            System.out.println(name + " (Length: " + name.length() + ")");
//        }
//    }
//}


public class StringLengthCounter { 
	public static void main(String[] args) {
		new ArrayList<>(Arrays.asList("vijay", "kamalesh", "ravi", "abhishek")).stream().sorted((a, b) -> b.length() - a.length()).forEach(s -> System.out.println(s + " (" + s.length() + ")"));
		}
}




