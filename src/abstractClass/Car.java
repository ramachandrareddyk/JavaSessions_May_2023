package abstractClass;

public abstract class Car {
	
	public Car(){
		System.out.println("Constructor");
	}
	
	abstract void start();
	
	public void test() {
		System.out.println("Testing");
	}

}
