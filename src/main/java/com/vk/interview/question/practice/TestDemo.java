package com.vk.interview.question.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		
	//	character wise count
		String name="vijaydsdsdsdsdasdsad";
		List<String> list =Arrays.asList(name.split(""));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(collect);
        
        
        
           //word wise count
      		String[] namearr= {"vijay","java","java","ajay"};
      		
      		List<String> listarr=Arrays.asList(name);
      		
     Map<String, Long> wordcountresult=listarr.stream().
    		 collect(Collectors.groupingBy(
    		 x->x , Collectors.counting()));
     System.out.println(wordcountresult);
     
     System.out.println("--------------------------------------------");
     
     String str1 = "JAva  kava";
     
     

     List<String> list1=Arrays.asList(str1.split(""));
       Map<String, Long> result= list1.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting()));
       
       System.out.println(result);
       
       System.out.println("-------------------------------------------------");
       String[] strarr = {"java" , "kava","html","html"};
       List<String> listarr1=Arrays.asList(strarr);
       Map<String, Long> result2= listarr1.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting()));
       
       System.out.println(result2);
     

     
     
     

      		
		

	}

}
