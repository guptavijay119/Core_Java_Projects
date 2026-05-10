package com.example.corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_all_anagrams_into_separate_lists {

	public static void main(String[] args) {
		
	//	Given a list of strings, find and group all anagrams into separate lists. 
	//  Example: List<String> anaList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
	//  Expected Output: // {eat, tea, ate}, {tan, nat}, {bat}
	//   
		
		List<String> anaList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		// Map<Key, List of anagrams>
        Map<String, List<String>> map = new HashMap<>();

        for (String word : anaList) {

            // Convert word to char array
            char[] ch = word.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Convert back to String
            String key = new String(ch);

            // If key not present create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add word into list
            map.get(key).add(word);
        }
		
		
        // Print result
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
		
		
		
		System.out.println("---------------------------------------------------");
		
		
		
		
		for(String group:anaList) {
			
			if(group.contains("eat")) {
				System.out.println("this is the eat string : " +group);
			}
			else if(group.contains("tea")){
				System.out.println("this is the tea string : " +group);
			}
			
			else if(group.contains("tan")){
				System.out.println("this is the tan string : " +group);
			}
			
			else if(group.contains("ate")){
				System.out.println("this is the ate string : " +group);
			}
			
			else if(group.contains("nat")){
				System.out.println("this is the nat string : " +group);
			}
			
			else if(group.contains("bat")){
				System.out.println("this is the bat string : " +group);
			}
			
			else {
				System.out.println( "Not found in group :");
				
			}
			
			
			
			
			
			
		}
		
		
		
		

	}

}
