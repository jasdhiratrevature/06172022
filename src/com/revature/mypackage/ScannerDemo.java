package com.revature.mypackage;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//  Command Line Arguments
	String name=args[0];
	
	System.out.println("Hello "+name);
}
}
