package com.example.corejava;

public class Integer_to_Binary_convert_output {

	public static void main(String[] args) {
         int num = 45;   // input value
        
        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;  // prepend remainder
            num = num / 2;
        }

        System.out.println("Binary: " + binary);
    }

	

}
