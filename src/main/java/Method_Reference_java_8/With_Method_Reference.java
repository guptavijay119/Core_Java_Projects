package Method_Reference_java_8;


@FunctionalInterface
interface Calculator113{
    int add(int a, int b);
}


public class With_Method_Reference {
	
	
	 public static int sum(int a, int b) {
	        return a + b;
	    }
	 
	 
	 public static void main(String[] args) {
		
		 
		 Calculator113 cal=With_Method_Reference::sum;
		 
		System.out.println( cal.add(10, 20));
		 
		 
	}
	
	
	

}
