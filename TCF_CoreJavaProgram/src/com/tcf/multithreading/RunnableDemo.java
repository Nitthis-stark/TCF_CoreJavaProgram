package com.tcf.multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		UsingRunnable u= new UsingRunnable(10,20,"Nitthis");
		
		Runnable r=()->{System.out.println("Run method overriden by Lambda Expression");};
		
		Thread t = new Thread(r,"Lambda Thread");
		t.start();
		
		Runnable r1=()->{System.out.println("2.Run method overriden by Lambda Expression");};
		Thread t1=new Thread(r1,"Lambda Thread");
		t1.start();
		
		Runnable r3=()->{
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i+".Hello");
			}
		};
		Thread t3=new Thread(r3,"Lambda Thread");
		t3.start();
	}
}
