package exceptionHandling;

public class TryCatch {
	
			//try catch
			//fainally
			//throws
			//throw
String name;
	public static void main(String[] args) {
		TryCatch tc= new TryCatch();
		tc=null;
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");
		try {
		System.out.println(9/0);
		System.out.println(tc.name);
		}	catch(ArithmeticException e) {
			e.printStackTrace();
		}  	catch(Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");
		
		

	}

}
