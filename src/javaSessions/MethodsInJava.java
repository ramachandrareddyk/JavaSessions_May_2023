package javaSessions;

public class MethodsInJava {

	public static void main(String[] args) {
		MethodsInJava m= new MethodsInJava();
		m.test();
		
		m.m1();
		
		int sum=m.sum();
		//System.out.println(sum);
		System.out.println(m.sum());
		
		m.add(20, 30);
		
		m.add(200, 300);
		
		m.add(10000, 4000);
		
		int value=m.sum1(34, 67);
		System.out.println(value);
		
		System.out.println(m.sum1(67, 90));
		

	}
	
//Method is a collection of instructions to perform specific task
	//Mathod-Function
	
	//Static Methods 
	//Non Static Methods
	
	//We Can not create method inside the method
	//Java is not allow duplicate methods
	//We can call one method in to another method
	//to call the non static methods we have to create an object
	//to call the static methods we have to use class name
	//Method can't return multiple values
	//method can return only one value at a time
	
	public void test() {
		System.out.println("This is test method");
		test1();
		/*
		 * public void m1() {
		 * 
		 * }
		 */
	}
	//Duplicate method
	/*
	 * public void test() {
	 * 
	 * }
	 */
	public void test1() {
		System.out.println("This is test 1");
	}
	
	//1. no input no return
	//void-does not return anything
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	//2. no input with return value
	public int sum() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//3.with input and no return
	
	public void add(int a, int b) {
		int add=a+b;
		System.out.println(add);
	}
	
	//4. with input and with return
	
	public int sum1(int a, int b) {
		int c=a+b;
		return c;
	}
	
	
	
	
	

}
