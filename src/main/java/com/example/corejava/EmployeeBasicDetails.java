package com.example.corejava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeBasicDetails {
	
	
	
	private String name="Vijay";
	private String address="Mankhurd";
	
	LocalDate currDate=LocalDate.now();
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob=currDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getCurrDate() {
		return currDate;
	}

	public void setCurrDate(LocalDate currDate) {
		this.currDate = currDate;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
