package javaSessions;

public class StringManupulations {

	public static void main(String[] args) {
		
		String str="Hello this is my first java code";
		
		//Length
		System.out.println("----------String length-----------");
		int length=str.length();
		
		System.out.println(length);
		
		System.out.println(str.length());
		
		System.out.println("----------CharAt Method-----------");
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(30));
		System.out.println(str.charAt(31));
		//System.out.println(str.charAt(32)); StringIndexOutOfBondsException
		
		System.out.println("----------indexOf Method-----------");
		
		System.out.println(str.indexOf("H"));
		
		System.out.println(str.indexOf("t"));
		
		System.out.println(str.indexOf("z"));
		
		System.out.println("----------------trim method--------------");
		
		String s="      Hello Testing       ";
		
		System.out.println(s);
		
		System.out.println(s.trim());
		
		System.out.println("----------------Replace method--------------");
		
		String date="06-08-2023";//06/08/2023
		
		System.out.println(date.replace("-", "/"));
		
		String s1="this is my first automation code";
		
		System.out.println(s1.replace(" ", ","));
		
		System.out.println("----------------Lower case to upper case--------------");
		
		String x="abcdefghijklmnopq";
		
		System.out.println(x.toUpperCase());
		
		
		String x1="ABCDEFGHIJKLMNOPQ";
		
		System.out.println(x1.toLowerCase());
		
		
		System.out.println("----------------Contains Method--------------");
		
		String s2="this is my first automation code";
		
		boolean b= s2.contains("automation");
		
		System.out.println(b);
		
		System.out.println(s2.contains("automatin"));
		
		System.out.println("----------------equals Method--------------");
		
		String y="Testing";
		String y1="Testing";
		
		System.out.println(y.equals(y1));
		
		String y2="testing";
		
		System.out.println(y.equals(y2));
		
		
		System.out.println(y.equalsIgnoreCase(y2));
		
		System.out.println("----------------Split Method--------------");
		
		String b1="java,c,c++,python,.net";
		
		System.out.println(b1);
		
		String aa[]=b1.split(",");
		
		String b2="Neha;Hrish;Mahesh;Sinija;Hima";
		
		String names[]=b2.split(";");
		
		for(String e:aa) {
			System.out.println(e);
		}
		
		for(String e:names) {
			System.out.println(e);
			
			
		System.out.println("---------------- Sub String--------------");
		
		String m="Your total money is 3000";
		
		System.out.println(m.substring(5));
		
		System.out.println(m.substring(5,12));
			
		}
		
		System.out.println("---------String Reverse------------");
		String z="testing";//7-1 =6
		//gnitset
		
		String rev="";
		for(int i=z.length()-1;i>=0;i--) {
			rev=rev+z.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		StringBuffer ss=new StringBuffer(z);
		
		System.out.println(ss.reverse());
		
		System.out.println("--------------------String to int--------------------");
		
		String n="10000";
		
		int i=Integer.parseInt(n);
		
		

	}

}
