package com.vk.java_21_features;

public class Structured_Concurrency {

	public static void main(String[] args) {
		
		
		// Use Case: Parallel Tasks, Asynchronous Programming

		// Without Structured Concurrency
		// Problem
		Thread thread1 = new Thread(() -> {
			System.out.println("Task 1");
		});

		Thread thread2 = new Thread(() -> {
			System.out.println("Task 2");
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// With Structured Concurrency
		// Interview Answer
		// Structured Concurrency एक programming model है जो asynchronous tasks को
		// manage करने के लिए उपयोग किया जाता है।
		// यह tasks को एक structured way में organize करता है, जिससे code readability और
		// maintainability बढ़ती है।

		var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor();
		try (executor) {
			executor.execute(() -> System.out.println("Structured Task 1"));
			executor.execute(() -> System.out.println("Structured Task 2"));
		}

	}

}
