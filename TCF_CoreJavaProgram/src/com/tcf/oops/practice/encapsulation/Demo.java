package com.tcf.oops.practice.encapsulation;

public class Demo {

	public static void main(String[] args) {
		Bank p1=new Bank();
		p1.setAccountHolderName("Nitthiyanantham");
		p1.setAccountNumber(98876);
		p1.setBalance(50000);
		p1.deposit(4000);
		p1.withdraw(2000);
		System.out.println(p1);
		Bank p2=new Bank(1234,"Keshavan",75000);
		p2.withdraw(9000);
		System.out.println(p2);

	}

}
