package abstractClass;

public class BankTest {

	public static void main(String[] args) {
	Bank b= new SBI();
	
	System.out.println(b.ROI());
	
	
	Bank b1= new HDFC();
	System.out.println(b1.ROI());

	}

}
