package Method_Reference_java_8;

//Without Method Reference (with Lambda) example:
	@FunctionalInterface
	 interface Calculator{
		
		public abstract int m1(int a,int b);
			
	}




public class Intro_parts {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal=(a,b)-> sum(a,b);
		System.out.println(cal.m1(1, 30));	
		
	}
	
	
	
	
	
	
	
	
}
