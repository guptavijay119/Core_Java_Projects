package Courses;

public class Courses_TEST extends Revenue1_Country  {
	
	public static void main(String[] args) {
		
		Courses_TEST ct = new Courses_TEST();

		
		//This data belongs to first country
		Integer courseid = ct.getCourse_id();
		String courseName = ct.getCourse_name();
		String billing_currency = ct.getBilling_currency();
		String country_name = ct.getCountry_name();

		System.out.println(courseid);
		System.out.println(courseName);
		System.out.println(billing_currency);
		System.out.println(country_name);
		
		
		System.out.println("--------------------------------------");
		
		Revenue2_Country country2=new Revenue2_Country();
		
		
		Integer courseid1 = country2.getCourse_id();
		String courseName1 = country2.getCourse_name();
		String billing_currency1 = country2.getBilling_currency();
		String country_name1 = country2.getCountry_name();

		System.out.println(courseid1);
		System.out.println(courseName1);
		System.out.println(billing_currency1);
		System.out.println(country_name1);
		
		
		

	}

}
