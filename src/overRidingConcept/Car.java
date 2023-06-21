package overRidingConcept;

public class Car {
	
	
	public void start() {
		System.out.println("car start");
	}
	
	public static void stop() {
		System.out.println("car stop");
	}
	
	public void color() {
		System.out.println("Car color");
	}
	
	public void price(int i) {
		System.out.println(i);
	}

}
