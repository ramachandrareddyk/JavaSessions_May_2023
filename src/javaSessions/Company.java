package javaSessions;

import java.util.ArrayList;

public class Company {
	
	String name;
	int empcount;
	
	public String getCEOName() {
		return "Tom";
	}
	
	public int getEmpCount() {
		return 567;
	}

	public static void main(String[] args) {
		Company com= new Company();
		
		System.out.println(com.getCEOName());
		
		System.out.println(com.getEmpCount());
		
		String founders[]=com.getCoFounders();
		
		for(String e:founders) {
			System.out.println(e);
		}
		
		ArrayList<String>p= com.products();
		for(String e:p) {
			System.out.println(e);
		}

	}
	
	public String[] getCoFounders() {
		String [] founders= {"Tom","Peter","Stive"};
		
		return founders;
	}
	
	public ArrayList<String> products() {
		
		ArrayList<String> Drinks= new ArrayList<String>();
		
		Drinks.add("ThumsUp");
		Drinks.add("Cocke");
		Drinks.add("Mazza");
		Drinks.add("7Up");
		
		return Drinks;
	}

}
