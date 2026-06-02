package vk.array.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Merge_TwoArrays {

	public static void main(String[] args) {
		System.out.println("Merge_TwoArrays");
		int[] a={1,3,5};
		int[] b={2,4,6};
		ArrayList<Integer>  list=new ArrayList<>();
		
		for(int arr1 : a) {
			list.add(arr1);
			
		}
		
		
		for(int arr2:b) {
			list.add(arr2);
			
		}
		
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
		

	}

}
