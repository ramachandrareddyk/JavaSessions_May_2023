package constructorConcept;

public class Student1 {
	
	int id;
	String name;
	
	public Student1(int i, String n) {
		id=i;
		name=n;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Student1 s= new Student1(111, "Kiran");
		Student1 ss= new Student1(222, "Arun");
		
		s.display();
		ss.display();
	}

}
