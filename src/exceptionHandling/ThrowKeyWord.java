package exceptionHandling;

public class ThrowKeyWord {
	
	
	
	
	public static void main(String[] args) {
		
		String name=null;
		
		if(name==null) {
			System.out.println("Bye...");
			try {
				throw new Exception("String value is null");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
