package inheritence;

public class BMW extends Car{
	
	
	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();
		
		b.test();
	}
	
	public void test() {
		System.out.println("This test car");
	}

}
