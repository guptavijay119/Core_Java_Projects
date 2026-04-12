package com.vk.oops;





class Bike {
	 void start() {
        System.out.println("Bike starts with kick..dfgdgdfg.");
    }
}

class Car extends Bike {
	
	void start() {
       System.out.println("Car starts with key...");
   }
}

public class Polymorphism_method_overridding extends Car   {	
	public static void main(String[] args) {
		
		Polymorphism_method_overridding pol=new Polymorphism_method_overridding();
		pol.start();
		

	}
}
