package constructorConcept;

public class Student2 {
	int id;
	String name;

	public Student2(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2(111, "Kiran");
		Student2 s2 = new Student2(222, "Arun");

		
		  s2.id=s1.id; 
		  s2.name=s1.name;
		 

		s1.display();
		s2.display();

	}

}
