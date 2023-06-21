package encapsulation;

public class Test {
	
	public String name;
	public int age;
	private String City;
	
	public String getName() {
		return "Phill";
	}
	
	private int getsal() {
		return 60000;
	}
	
	
	public static void main(String[] args) {
		Test t= new Test();
		
		t.name="Tom";
		t.age=34;
		t.City="Bangalore";
		
		t.getName();
		t.getsal();
	}

}
