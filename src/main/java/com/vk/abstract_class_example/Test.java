package com.vk.abstract_class_example;

import java.sql.Connection;
import java.sql.DriverManager;

interface Bank {

	abstract void Savefordatamethods();

	abstract void displayfordatamethods();

	abstract void DatabaseConfigurationMethods();

	// void display() {
	// System.out.println("Bank Details");
	// }
}




//SBI BANK CLASS
class SBI implements Bank {

	@Override
	public void Savefordatamethods() {
		System.out.println("sbi interest rate is 7%");

	}

	@Override
	public void displayfordatamethods() {
		// TODO Auto-generated method stub

	}

	@Override
	public void DatabaseConfigurationMethods() {

		System.out.println("THIS IS THE DATABASE CONFIGURATION METHODS SBI ");

		String url = "jdbc:postgresql://localhost:5432/07022026de";
        String username = "postgres";
        String password = "postgres";
        
        
        try {

            Class.forName("org.postgresql.Driver");

            Connection con =
                    DriverManager.getConnection(url, username, password);

            System.out.println("SBI Database Connected Successfully");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

	}

}




// HDC BANK CLASS
class HDFC implements Bank {

	public void displayfordatamethods() {
		System.out.println("HDFC IS PROVIDING THE 8 % OF INTEREST RATE ");

	}

	@Override
	public void Savefordatamethods() {
		// TODO Auto-generated method stub

	}

	@Override
	public void DatabaseConfigurationMethods() {
		System.out.println("THIS IS THE DATABASE CONFIGURATION OF HDFC BANK");

	}

}





class Test {
	public static void main(String[] args) {

		SBI sbi = new SBI();
		sbi.Savefordatamethods();
		sbi.displayfordatamethods();
		sbi.DatabaseConfigurationMethods();
		
		
		System.out.println("---------------------");

		HDFC hdfc = new HDFC();
		hdfc.displayfordatamethods();
		hdfc.DatabaseConfigurationMethods();
		
		
		
		

	}
}
