package com.ck.interface_example;

public class Marker_interface_cloneable  implements  Cloneable {

 int id=221303;	
 String name="vijay";
	
	public static void main(String[] args) throws Exception {
		
		Marker_interface_cloneable marclone=new Marker_interface_cloneable();
		
		Marker_interface_cloneable marclone1=(Marker_interface_cloneable) marclone.clone();
		
		System.out.println(marclone1.id + ' '+   marclone1.name );
		

	}

}
