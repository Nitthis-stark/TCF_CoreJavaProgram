package com.tcf.shopping;

public class ShoppingExecutor {

	public static void main(String[] args) {
		ShoppingMall s= new Electronics();
		Customer c1 = new Customer(11,"Nitthis","Cuddalore",s);
		System.out.println(c1);
		c1.order();
	}

}
