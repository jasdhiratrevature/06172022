package com.revature.myclasses;

public class StudentManager {
public static void main(String[] args) {
	
	// Create an Object of Student class
	Student s1=new Student();
	
	s1.createStudent(101, "Jasdhir", "Java");
	
	// create a second object
	Student s2=new Student();
	s2.createStudent(102, "Mathew", "AWS");
	
	// call the display method
	s1.displayStudent();
	s2.displayStudent();
	
	int []myArr=new int[5];
	
	Student [] student=new Student[5];

	for(int i=0;i<student.length;i++)
		student[i]=new Student();
	
	student[0].createStudent(105, "AAA", "AAAA");
	student[0].displayStudent();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
}
}
