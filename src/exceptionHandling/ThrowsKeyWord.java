package exceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyWord th= new ThrowsKeyWord();
		
		th.m1();

	}
	//passing the exception one method to another method
	
	public void m1() throws ArithmeticException{
		System.out.println("M1");
		m2();
	}
	public void m2() throws ArithmeticException{
		System.out.println("M2");
		m3();
	}
	public void m3() throws ArithmeticException{
		System.out.println("M3");
		m4();
	}
	public void m4()throws ArithmeticException {
		System.out.println("M4");
		int a=9/0;
		
		//we have to handle the exception here
	}

}
