package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		b=30;
		
		String s="Ravi";
		String s1="Suresh";
		
		s1="Chandra";
		
		//Array is the collection of similar type of data
		//it will store the values in index basis
		//0,1,2,3,4,5,6
		
		//1. Static array
		//2. Dynamic array
		
		
		//Static array---Array length should be fixed
		//Lowest index is -0
		//Highest index is - length-1
		
		//1. int array
		int i[] = new int[5];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		
		//i[5]=600;//ArrayIndexOutOfBoundsException
		//i[-1]=800;//ArrayIndexOutOfBoundsException
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println(i[4]);
		
		//System.out.println(i[5]);//ArrayIndexOutOfBoundsException
		
		//System.out.println(i[-1]);
		System.out.println("---------------");
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		System.out.println("-------------------");
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
		}
		System.out.println("-------for each-------");
		for(int e:i) {
			System.out.println(e);
		}
		
		int x[]= {1,3,4,19,67,56,45,39};
		
		System.out.println(x.length);
		
		System.out.println(x[7]);
		
		//double array
		System.out.println("------double array--------");
		double d[]= new double[5];
		d[0]=23.45;
		d[1]=45.89;
		
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		
		for(double e:d) {
			System.out.println(e);
		}
		
		
		System.out.println("------char array--------");
		char c[]= new char[4];
		c[0]='a';
		c[1]='2';
		c[2]='@';
		c[3]='G';
		
		for(char characters:c) {
			System.out.println(characters);
		}
		System.out.println("-----------String array---------");
		String str[]= new String[6];
		str[0]="Mahesh";
		str[1]="Ranjith";
		str[2]="Revanth";
		str[3]="Manju";
		
		for(String e:str) {
			System.out.println(e);
		}
		
		System.out.println("-------Object ARray--------");
		Object empData[]=new Object[6];
		empData[0]=10003;
		empData[1]="Ramesh";
		empData[2]=45600.89;
		empData[3]='M';
		empData[4]=true;
		
		for (int j = 0; j < empData.length; j++) {
			System.out.println(empData[j]);
		}
		
		for(Object e:empData) {
			System.out.println(e);
		}
		
		//create one int array 2,4,5,6
		//sum of the array =17
		
		//find the min and max number in array 2, 6
		
		//find prime or not 10
		
		
		
		

	}

}
