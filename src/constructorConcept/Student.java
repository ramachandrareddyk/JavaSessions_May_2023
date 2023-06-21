package constructorConcept;

public class Student {
	
	int id;
	String name;
	
	Student(){
		id=101;
		name="Mukesh";
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Student st= new Student();
		Student st1= new Student();
		
		st.display();
		
		st1.display();
		
	}

}
