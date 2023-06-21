package javaSessions;

public class ThisKeyWord {
	
	int rollNo;
	String Name;
	double fee;
	
	public ThisKeyWord(int rollNo,String Name,double fee) {
		
		  this.rollNo=rollNo; this.Name=Name; this.fee=fee;
		 
		
	
		
		
	}
	
	public void display() {
		System.out.println(rollNo+" "+Name+" "+fee);
	}
	
	void m1() {
		System.out.println("Hello m1");
	}
	
	void m2() {
		System.out.println("Hello M2");
		
		m1();
		this.m1();
	}

	public static void main(String[] args) {
		
		ThisKeyWord t= new ThisKeyWord(100, "Phill", 45600.00);
		
		t.display();
		

	}

}
