package com.vk.design_pattern;

interface shape {
	void draw();
}


class Circle implements shape{

	@Override
	public void draw() {
		System.out.println("draw circle");
		
	}
	
}

class Square implements shape{

	@Override
	public void draw() {
		System.out.println("draw square......");
		
	}
	
}


class ShapeFactory {

    public static shape getShape(String type) {

        if(type.equalsIgnoreCase("circle"))
            return new Circle();
        else
            return new Square();
    }
}

public class Factory_Pattern {
	public static void main(String[] args) {
		
		
		shape s1=ShapeFactory.getShape("circle");
		s1.draw();
		
		shape s2=ShapeFactory.getShape("square");
		s2.draw();
		
		 	/*
			 * Easy Interview Line:
			 * 
			 * Factory Pattern creates objects based on input condition and hides object
			 * creation logic from client.
			 * 
			 * 
			 * 
			 * Real Project Use: Notification Factory (SMS / Email / WhatsApp) Payment
			 * Factory Report Generator Factory DAO Factory
			 *
			 *
			 * Why Use It?
			 * 
			 * When object creation depends on condition:
			 * 
			 * Credit Card payment UPI payment Cash payment
			 * 
			 * Client asks for payment method, factory gives object.
			 * 
			 * Real Life Example:
			 * 
			 * 🏭 Car Factory
			 * 
			 * You ask for:
			 * 
			 * BMW Audi Tata
			 * 
			 * Factory creates requested car.
			 * 
			 * You don’t manually build engine, tyre, door.
			 *
			 *
			 *
			 */
		
		
		
		

	}

}






