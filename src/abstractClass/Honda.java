package abstractClass;

public class Honda extends Bike{

	public static void main(String[] args) {
		Bike b= new Honda();
		
		b.run();

	}


	void run() {
		System.out.println("Running safely");
		
	}

}
