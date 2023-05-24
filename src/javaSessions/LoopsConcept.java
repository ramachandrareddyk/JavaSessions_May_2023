package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		//While loop
		//for loop
		//do while loop
		
		//While loop
		//1-100
		System.out.println("-------------while loop---------------");
		int a=1;//initialization
		while(a<=10) {//condition
			System.out.println(a);//1 2....99 100//   Print statement or logic
			//a++;//2 3.....100 101// increment or decrement
			//++a;
			a=a+1;
		}
		System.out.println("----------------------------");
		int b=0;
		while(b<=9) {
			System.out.println(b);
			b++;
		}
		
		System.out.println("-------------for loop---------------");
		//for loop
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int i=0;i<=10;) {
			System.out.println(i);
			i++;
		}
		
		int x=1;
		for(x=1;x<10;x++) {
			System.out.println(x);
		}
		
		/*
		 * for(;;) { System.out.println("Testing"); }
		 */
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		System.out.println("--------Alphabits--------");
		for(char i='a';i<='z';i++){
		System.out.println(i);
		
		}
		
		for(int i='a';i<='z';i++) {
			System.out.println(i);
		}
		System.out.println("===========================");
		
		for(double d=1.1;d<10;d++) {
			System.out.println(d);
		}
		
		for(int i=0;i<=100;i=i+10) {
			System.out.println(i);
		}
		
		System.out.println("==============Break loop=============");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			if (i % 5 == 0) {
				System.out.println("Hi...");
				break;
			}
		}
		System.out.println("===========Even Numbers============");
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		for(int i=0;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("===========Odd Numbers============");
		for(int i=0;i<=50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		//do while loop
		System.out.println("===========Do While Loop============");
		int y=1;
		do {
			System.out.println(y);
			y++;
		}
		while(y<10);
		
		//print prime numbers 100
		//2, 3, 5, 7, 11, 13, 17, 19
		
		
	}

}
