package javaSessions;

public class User {

	String Name;
	int age;
	String City;
	public static void main(String[] args) {
		
		User u1= new User();
		u1.Name="Neeraj";
		u1.age=23;
		u1.City="Hyd";
		
		User u2= new User();
		u2.Name="Sonu";
		u2.age=23;
		u2.City="BLR";
		
		
		User u3= new User();
		u3.Name="Charan";
		u3.age=23;
		u3.City="Pune";
		
		System.out.println(u1.Name+" "+u1.age+" "+u1.City);
		System.out.println(u2.Name+" "+u2.age+" "+u2.City);
		System.out.println(u3.Name+" "+u3.age+" "+u3.City);
		
		System.out.println("----------------------");
		u1=u2;
		
		System.out.println(u1.Name+" "+u1.age+" "+u1.City);
		System.out.println(u2.Name+" "+u2.age+" "+u2.City);
		System.out.println(u3.Name+" "+u3.age+" "+u3.City);
		
		System.out.println("----------------------");
		u2=u3;
		
		System.out.println(u1.Name+" "+u1.age+" "+u1.City);
		System.out.println(u2.Name+" "+u2.age+" "+u2.City);
		System.out.println(u3.Name+" "+u3.age+" "+u3.City);
		
		System.out.println("----------------------");
		u3=u1;
		
		System.out.println(u1.Name+" "+u1.age+" "+u1.City);
		System.out.println(u2.Name+" "+u2.age+" "+u2.City);
		System.out.println(u3.Name+" "+u3.age+" "+u3.City);

	}

}
