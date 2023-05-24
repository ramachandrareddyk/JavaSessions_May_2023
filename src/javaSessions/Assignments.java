package javaSessions;

public class Assignments {
	
	
	public static void main(String[] args) {
		System.out.println(" ------------Sum of the array-----------");
		int a[]= {2,3,5,1,7,6,9};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		System.out.println(" ------------Largest and smalest value in array-----------");
		
		int b[]= {23,34,13,64,72,10,90,9,27};
		
		int min=b[0];
		int max=0;
		for (int i = 0; i < b.length; i++) {
			if(b[i]>max) {
				max=b[i];
			}
			if(b[i]<min) {
				min=b[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(" ------------is Prime number-----------");
		
		int number=29;
		int prime=1;
		for (int i = 2; i < number; i++) {
			if((number%i)==0) {
				prime=0;
			}		
		}
		if(prime==1) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is not a prime number");
		}
		
		//Swaping two numbers
		int x=10;
		int y=20;
		
		System.out.println(x);//20
		System.out.println(y);//10
		
	}
	
	
	
	
	

}
