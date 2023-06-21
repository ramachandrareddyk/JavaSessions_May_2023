package methodOverLoading;

public class Animal {

	public static void main(String[] args) {
		Animal a= new Animal();
		
		a.test(20, 30);
		a.test();
		a.test(101, "Ramesh");
		

	}
	//Class having multiple methods with same name
	//With different parameters and 
	//different number of parameters
	
	public void test() {
		System.out.println("Test");
	}
	
	public void test(int a, int b) {
		System.out.println(a+b);
	}
	
	public void test(int x, int y, String i) {
		
	}
	
	public void test(int id, String name) {
		System.out.println(id+name);
	}
	

}
