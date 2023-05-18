package javaSessions;

public class ConditionalOperaters {

	public static void main(String[] args) {
	//< > <= >= == !=

		
		int a=10;
		int b=15;
		
		System.out.println(a==b);
		
		//if
		//if else
		//Nested if
		//if else if
		//switch case
		System.out.println("-----------------if---------------");
		if(a<b) {
			System.out.println("Hello");
		}
		
		if(a!=b) {
			System.out.println("Both are not equal");
		}
		
		if(true) {
			System.out.println("test");
		}
		
		System.out.println("---------------if Else----------------------");
		if(a==b) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
		/*
		 * if(false) { System.out.println("Hello"); }else {
		 * System.out.println("Bye..."); }
		 */
		
		String s="Selenium";
		String s1="selenium";
		
		if(s1==s) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		if(s1.equals(s)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		System.out.println("---------------nested if--------------------");
		
		int marks=67;
		
		if(marks>=45) {
			System.out.println("Pass");
			if(marks>=60) {
				System.out.println("Grade B");
				if(marks>=75) {
					System.out.println("Grade A");
					if(marks>90) {
						System.out.println("Grade A++");
					}
				}
			}
		}else {
			System.out.println("Fail");
		}
		marks=67;
		System.out.println("---------------if else if--------------------");
		if(marks>=90) {
			System.out.println("Grade A++");
		}else if(marks>=75) {
			System.out.println("Grade A");
		}else if(marks>=60) {
			System.out.println("Grade B");
		}else if(marks>=45) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		//100 test cases
		//chrome, fire fox, safri
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome Browser");
		}
		
		if(browser.equals("FF")) {
			System.out.println("Launch FF Browser");
		}
		
		if(browser.equals("safari")) {
			System.out.println("Launch safari Browser");
		}
		
		browser="test";

		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome Browser");
		} else if(browser.equals("FF")) {
			System.out.println("Launch FF Browser");
		}else if(browser.equals("safari")) {
			System.out.println("Launch safari Browser");
		}else {
			System.out.println("Please pass the correct browser name");
		}
		
		System.out.println("-------------Comparing multiple variables---------------");
		//&& And
		//|| or
		
		int x=1000;
		int y=230;
		int z=2300;
		
		if(x>y && x>z) {
			System.out.println("x is the largest num");
		}else if(y>z) {
			System.out.println("Y is the Largest num");
		}else {
			System.out.println("z is the Largest num");
		}
		
		
		//Assignment find max and min value
		int c=45;
		int d=1;
		int e=89;
		int f=102;
		int g=67;
		int h=0;
		
		
		
		
	}

}
