package accessModiFiers;

public class Test {
	
	//default
	//Private
	//Protect
	//Public
	
	
	//1. Default
	//Variables and Methods We can access in same class and Outside the class in same package
	//We can't able to access outside the package
	
	int a;
	String s;
	
	
	void test() {
		System.out.println("Deafult method");
	}
	
	//2. Private
	//private variables and methods we can able to access only inside the class
	//We can't able to access out side class
	
	private int x;
	
	private void add() {
		System.out.println("Add method");
	}
	
	//3. Protected
	//Private variables and methods we can able to access inside the class, Out side the class in same package and 
	//Outside the package in chaild class or sub class
	protected int z;
	
	protected void sum() {
		System.out.println("This is sum");
	}
	
	//Public
	public int number;
	
	public void m1() {
		System.out.println("This is M1 method");
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		
		t.s="test";
		t.a=45;
		
		t.test();
		
		
		t.x=34;
		t.add();
		
		
		t.z=56;
		t.sum();
		
		t.number=100;
		t.m1();
		
		
	

		
	}
	

}
