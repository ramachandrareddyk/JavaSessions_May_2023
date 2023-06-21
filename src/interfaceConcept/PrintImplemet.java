package interfaceConcept;

public class PrintImplemet implements Printable{

	
	public void print() {
		System.out.println("Hello...");
		
	}
	
	public static void main(String[] args) {
		PrintImplemet pm= new PrintImplemet();
		
		pm.print();
		
	}

}
