package javaSessions;

public class Employee {

	
	//Class is a group of objects which have comman properties
	//it's template or bluprint from which objects are created
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	int a=100;
	
	public static void main(String[] args) {
		String name="peter";
		System.out.println(name);
		
		Employee emp = new Employee();
		
		emp.name="Ramesh";
		emp.age=34;
		emp.salary=98000.00;
		emp.isActive=true;
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println(emp.isActive);
		
		Employee emp1= new Employee();
		
		emp1.name="Mahesh";
		emp1.age=34;
		emp1.salary=45000.00;
		emp1.isActive=false;
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		System.out.println(emp1.isActive);
		
		System.out.println(emp.name+" "+emp.age+" "+emp.salary+" "+emp.isActive);
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary+" "+emp1.isActive);
		
		Employee emp2= new Employee();
		
		emp2=null;
		
		emp2.name="Suman";// null pointer exception because emp2 is null
		
		
		System.gc();
		
		new Employee().name="Lisa";
		new Employee().age=23;

	}

}
