package javaSessions;

public class StringConcatination {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		System.out.println(a+b);//20
		//Mathamatical Operations we can perform for below data types
		//byte, short, long, int, float and double
		String s="Hello";
		String s1="Testing";
		System.out.println(s+s1);//Hello Testing
		
		String x="2000";
		String y="4000";
		System.out.println(x+y);//
		//if user try to add  int and string it will perform concatination operation
		System.out.println(a+x);//1002000
		
		System.out.println(x+y+a+b);//
		
		System.out.println(x+y+s+s1);
		
		System.out.println(a+b+x+y);//
		
		System.out.println(a+x+b+y);//
		
		System.out.println(x+a+b+y);//
		
		System.out.println(x+(a+b)+y);//
		
		System.out.println(x+y+(a+b));
		
		System.out.println("The value of a is "+a);
		
		System.out.println("The sum of a and b"+(a+b));
		
		System.out.println(a+b+" sum of a and b");
		
		System.out.println("----------------------------------------");
		
		char c='a';//97
		char d='b';//98
		
		System.out.println(c+d);
		
		System.out.println('j'+'a'+'v'+'a');
		System.out.println("-----------------------------------");
		
		System.out.println(10+20);//30
		
		System.out.println("10"+"20");//1020
		
		System.out.println(20-10);//10
		
		System.out.println(10*10);//100
		
		System.out.println(4/2);//2
		
		System.out.println(20/4);
		
		System.out.println(20%4);
		
		System.out.println(20%3);
		
		System.out.println(9/0);
		
		

	}

}
