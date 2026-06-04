package com.vk.java_21_features;

public class Sequenced_Collections {

	public static void main(String[] args) {
		
		//Interview Answer
		//Sequenced Collections ordered collections के first और last elements को आसानी से access करने की सुविधा देती हैं।
		// Use Case: Ordered Data, Predictable Iteration

		// Without Sequenced Collections
		// Problem
		java.util.Set<String> set = new java.util.HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		for (String element : set) {
			System.out.println(element);
		}

		// With Sequenced Collections
		// Interview Answer
		// Sequenced Collections एक collection type है जो elements को insertion order
		// में maintain करता है।
		java.util.List<String> sequencedList = new java.util.ArrayList<>();
		sequencedList.add("A");
		sequencedList.add("B");
		sequencedList.add("C");

		for (String element : sequencedList) {
			System.out.println(element);
		}

	}

}
