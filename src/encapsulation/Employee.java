package encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private String city;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	

}
