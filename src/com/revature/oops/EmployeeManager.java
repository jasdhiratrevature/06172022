package com.revature.oops;

public class EmployeeManager {
	public static void main(String[] args) {
		//Employee emp=new Employee();
		SalariedEmployee se=new SalariedEmployee(101, "Jas", 22);
		double salSE=se.calculateSalary(se.getDaysPresent());
		System.out.println("Id : "+se.getId() +" Name : "+se.getName()+
				"  Days Present : "+se.getDaysPresent()+" Salaey : "+salSE);
		
		// To Do for CE
		
		
		
	}
}
