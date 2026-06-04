package com.vk.java_21_features;

public class Scoped_Values {

	public static void main(String[] args) {
		
		// Use Case: Context Propagation, Thread-Local Variables

		// Without Scoped Values
		// Problem
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		threadLocal.set("Thread Local Value");

		Thread thread = new Thread(() -> {
			System.out.println(threadLocal.get());
		});
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		
		// With Scoped Values
		// Interview Answer
		// Scoped Values एक mechanism है जो context values को manage करने के लिए उपयोग
		// किया जाता है।
		java.lang.ScopedValue<String> scopedValue = java.lang.ScopedValue.newInstance();

		Thread scopedThread = new Thread(() -> {
			System.out.println(scopedValue.get());
		});
		scopedThread.start();

		try {
			scopedThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
