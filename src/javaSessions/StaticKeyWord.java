package javaSessions;

public class StaticKeyWord {
	
	int id;
	String name;
	String city;
	static int age;

	public static void main(String[] args) {
		StaticKeyWord st= new StaticKeyWord();
		
		st.id=3445;
		st.name="Naveen";
		
		st.test();
		
		
		//1 using class name
		StaticKeyWord.age=34;
		
		StaticKeyWord.add();
		
		//2.using Object
		st.age=35;
		st.add();
		
		//3. Direct
		age=46;
		add();

	}
	
	
	public void test() {
		System.out.println("test Method");
		
		int x=100;
		
	 int y=100;
	}
	
	public static void add() {
		System.out.println("this is add method");
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

}
