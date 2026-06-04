package com.vk.java_21_features;

public class Generational_ZGC {

	public static void main(String[] args) {
		
		// Use Case: Low Latency Applications, Large Heap Sizes

		// Without Generational ZGC
		// Problem
		System.gc();

		// With Generational ZGC
		// Interview Answer
		// Generational ZGC एक garbage collector है जो low latency applications और large
		// heap sizes के लिए optimized है।
		//Interview Answer

		//Generational ZGC memory को Young और Old generations में divide करके garbage collection को faster बनाता है।
		System.gc(); // Triggering garbage collection for demonstration

	}

}
