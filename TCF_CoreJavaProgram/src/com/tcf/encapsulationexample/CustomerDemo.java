package com.tcf.encapsulationexample;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(01);
		c1.setName("Nitthiyanantham");
		c1.setCity("Panruti");
		System.out.println(c1); 
		//object printing invoke method
		
		  Customer c2 = new Customer();
		  c2.setCid(02);
		  c2.setName("Vishwa");
		  c2.setCity("Panruti");
		  System.out.println(c2);
		  
		  Customer c3 = new Customer();
		  c3.setCid(03);
		  c3.setName("Praveen");
		  c3.setCity("Vambupet");
		  System.out.println(c3);
		 
	}

}
