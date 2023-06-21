package overRidingConcept;

public class BMW extends Car{
	@Override
	public void color() {
		System.out.println("Car color is blue");
	}
	@Override
	public void price(int i) {
		
	}
	
	public static void stop() {
		
	}
	
	
	public static void main(String[] args) {
		BMW b= new BMW();
		
		b.color();
		
		b.start();
		
		b.stop();
		
		Car c=new Car();
		
		c.color();
	}

}
