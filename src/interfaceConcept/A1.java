package interfaceConcept;

public class A1 implements Printable,Drawable{

	public static void main(String[] args) {
		A1 a= new A1();
		
		a.draw();
		
		a.print();

	}

	@Override
	public void draw() {
		System.out.println("Draw somthing....");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print SOmthing.....");
		
	}

}
