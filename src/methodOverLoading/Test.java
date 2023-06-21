package methodOverLoading;

public class Test {
	
	public Test() {
		System.out.println("default constructor");
	}
	
	public Test(int a, int b) {
		System.out.println(a+b);
	}
	
	public Test(String name, int age) {
		System.out.println(name+"  "+age);
	}

	public static void main(String[] args) {
		
		Test t= new Test();
		
		Test t1= new Test(23,67);
		
		Test t2= new Test("Fasil", 34);
		
		

	}

}
