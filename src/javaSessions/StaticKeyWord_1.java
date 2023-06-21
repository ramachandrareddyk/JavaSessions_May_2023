package javaSessions;

public class StaticKeyWord_1 {


	String name;
	int price;
	String color;
	
	static int wheels=4;
	
	public static void main(String[] args) {
		StaticKeyWord_1 c1= new StaticKeyWord_1();
		
		c1.name="Audi";
		c1.price=30;
		c1.color="Blue";
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+wheels);
		
StaticKeyWord_1 c2= new StaticKeyWord_1();
		
		c2.name="BMW";
		c2.price=50;
		c2.color="White";
		
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+wheels);
		
		

	}

}
