package exceptionHandling;

public class FinalyBlock {

	public static void main(String[] args) {
		try {
			System.out.println("A");
			int a=9/0;
		} catch (ArithmeticException e) {
			System.out.println("AE Exception....");
		} finally{
			System.out.println("Bye...");
		}
		
		//ex:
		//Make DB Connecttion
		//Get the data using SQL query----Exception
		//Use that data
		
		//close the DB connection----> Finally block
		
		
	int x=getNum("Tom");
	System.out.println(x);

	}
	
	public static int getNum(String name) {
		if(name.equals("Ravi")) {
			try {
				int marks=90/2;
				return marks;
			} catch (ArithmeticException e) {
				return 40;
			}finally {
				return 1000;
			}
		}else if(name.equals("Tom")) {
			return 100;
		}else {
			return 50;
		}
	}

}
