package javaSessions;

public class DataTypes {

	//Primitive Data types-->without creating an object we can use
	//Integer family--we can store the numbers without decimals
		//byte
		//short
		//int
		//long
	//floating family
		//double
		//float
	//Charcter
		//char
	//boolean
		//true/false
	
		
	//Non Primitive data types
	//Class, Arrays, ArrayList, HashMap, String
	
	String str="This is my first java programe";
	String str1="123456789!@#$%^&*      ";
	String str2="T";
	
	public static void main(String[] args) {
	//byte  --default value of byte is 0
		
		byte b = 10;
		//byte b=20;//duplicate variable names are not allowed
		
		byte b1=20;
		byte b2=20;
		
		//byte -is data type
		//b -variable name
		//= - is assignment operater
		//10 - value
		
		//size= 1 byte = 8-bits
		//Range = -128 to 127
		
		byte b3=-128;
		
		System.out.println(b3);
		
		byte b4=-34;
		
		System.out.println(b4);
		
		byte b5=23;
		System.out.println(b5);
		
		//short----default value of byte is 0
		
		short s = 100;
		//size= 2 byte = 16-bits
		//Range = -32768 to 32767
		
		short s1=32767;
		
		//int --default value of byte is 0
		int i = 1000;
		
		//size= 4 byte = 32-bits
		//Range = -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
		
		int i1=4000000;
		//int l2=45.56;
		
		//long --default value of byte is 0
		long l=1234567890;
		
		//size= 8 byte = 64-bits
		//Range = -2^63 to 2^63-1(18 digits)
		
		long l1=12345678901L;
		
		//float
		float f=23.89f;
		float f1=(float)123.89;
		
		//size= 4 byte = 32-bits
		//range= accepts 7 digits after Decimal
		float f2=234f;//234.0
		
		//double
		double d=222.90;
		//size= 8 byte = 64-bits
		//range= accepts 15 digits after Decimal
		
		double d1=999;//999.0
		
		//Character
		//size= 2 byte = 16-bits
		 char c='d';
		 char c1='5';
		 char c2='$';
		 
		 //boolean
		 boolean bb=true;
		 boolean bb1=false;
		//size= around  1-bits
		 
		// boolean bb2=test;
		 char c3=' ';
	}

}
