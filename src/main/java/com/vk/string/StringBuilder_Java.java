package com.vk.string;

public class StringBuilder_Java {

	public static void main(String[] args) {
		
		// Difference between string builder and string buffer
		
		/* Short Answer

		StringBuilder and StringBuffer are mutable string classes. 
		StringBuilder is faster but not thread-safe, 
		while StringBuffer is synchronized and thread-safe. */
		
	/*	
		| Feature         | StringBuilder | StringBuffer |
		| --------------- | ------------- | ------------ |
		| Thread Safe     | No            | Yes          |
		| Performance     | Faster        | Slower       |
		| Synchronization | No            | Yes          |
		| Introduced      | Java 5        | Java 1.0     |
 */
		
		
		String s1="vijaykumar";
		StringBuilder sb1=new StringBuilder(s1);
		System.out.println(sb1.reverse());
		System.out.println(sb1.reverse());
		System.out.println(sb1.length());
		
		StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("append(): " + sb);

        // insert()
        sb.insert(5, "Best ");
        System.out.println("insert(): " + sb);

        // delete()
        sb.delete(5, 10);
        System.out.println("delete(): " + sb);

        // replace()
        sb.replace(5, 16, "Coding");
        System.out.println("replace(): " + sb);

        // reverse()
        sb.reverse();
        System.out.println("reverse(): " + sb);

        // length()
        System.out.println("length(): " + sb.length());

        // capacity()
        System.out.println("capacity(): " + sb.capacity());

        // toString()
        String str = sb.toString();
        System.out.println("toString(): " + str);
		
		
		
		

	}

}
