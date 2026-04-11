package com.vk.oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlException {

	public static void main(String[] args) {
		
		try {
			
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/de23052025\r\n"
                + "", "postgres", "postgres");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pims.user_detail");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            con.close();
        } 
            
            catch (SQLException e) {
           System.out.println("SQL Exception: " + e.getMessage());
      }
	

	}

}
