package Courses;

public class Revenue1_Country extends Revenue2_Country {
	private int course_id=5118;
	private String course_name="Spring Boot";
	private String billing_currency="Dollar" ;
	private String country_name="USA";
	
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getBilling_currency() {
		return billing_currency;
	}
	public void setBilling_currency(String billing_currency) {
		this.billing_currency = billing_currency;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	
	
	
	
}
