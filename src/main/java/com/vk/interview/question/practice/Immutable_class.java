package com.vk.interview.question.practice;

public class Immutable_class {
	
	private final  int empid;
	private final String empName;

	public Immutable_class(int empid,String empName) {
		this.empid=empid;
	    this.empName=empName;
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getEmpName() {
		return empName;
	}
	
	

}
