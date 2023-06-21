package inheritence;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d= new Dog();
		d.eat();
		d.bark();
		System.out.println("------------------");
		BabyDog bb= new BabyDog();
		
		bb.eat();
		bb.bark();
		bb.weep();
		
		Cat c= new Cat();
		c.catTest();
		c.eat();

	}

}
