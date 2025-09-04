package com.tcf.constructor;

public class ConstructorAssignment {
	 public static void main(String[] args) {
		 
	        // Creating multiple student objects using constructor
	        Student s1 = new Student(01, "Nitthiyanantham", "AIML");
	        Student s2 = new Student(02, "Vishwa", "IT");
	        Student s3 = new Student(03, "Karthikeyan", "CSE");

	        // Displaying student details
	        s1.displayInfo();
	        s2.displayInfo();
	        s3.displayInfo();
	    }
}
