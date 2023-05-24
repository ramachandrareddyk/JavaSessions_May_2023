package javaSessions;

import java.util.ArrayList;

public class ArryListConcept {

	public static void main(String[] args) {
	
		//ArrayList - default class in java
		//Dynamic array
		//Array list size is not fixed
		
		
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		ar.add("Mahesh");
		ar.add(456.90);
		ar.add(true);
		ar.add('d');
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		ar.add(600);//5
		ar.add(700);//6
		
		System.out.println(ar.size());
		
		ar.remove(3);
		
		System.out.println(ar.get(3));
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
	System.out.println("-------------get all the values from an arraylist--------------");	
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Genarics in java
		
		ArrayList<String>names= new ArrayList<String>();
		
		names.add("Mallesh");
		names.add("Lakshman");
		
		for(String e:names) {
			System.out.println(e);
		}
		
		ArrayList<Integer>id= new ArrayList<>();
		id.add(678);
		id.add(567);
		
		for(Integer e:id) {
			System.out.println(e);
		}
		
		ArrayList<Object>empdate=new ArrayList<Object>();
		empdate.add(10003);
		empdate.add("Ramesh");
		empdate.add("Ramesh");
		empdate.add(45600.89);
		empdate.add('M');
		empdate.add(true);
		
		for (int i = 0; i < empdate.size(); i++) {
			System.out.println(empdate.get(i));
		}
		System.out.println("-----------");
		for(Object e:empdate) {
			System.out.println(e);
		}
	}
	
	//use cae in selenium
	//100 links in page
	//get all the links
	//store in to array list
	//start loop
	//print the text
	
	
	//dropdown
	//having 100 options
	//Get all the options
	//start the loop
	//print text
	
	//we have a company
	//with 3 founders--Array
	//no of employees have 100--Arraylist
	
	

}
