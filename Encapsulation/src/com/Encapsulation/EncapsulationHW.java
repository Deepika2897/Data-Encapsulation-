package com.Encapsulation;

import java.util.Scanner;

//Encapsulation: Binding of data
//gathering information and initialize it in inside the class

//class method variable

class Student{  //blue print or it user defined data type
	int studid;  //instance variables
	String studname;
	float studfees;
	int studage;
	
	//member function or methods
	void accept() {
		//access data
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter a studid");
		studid=sc.nextInt();
		System.out.println("Enter a studname");
		studname=sc.next();
		System.out.println("Enter the studfees");
		studfees=sc.nextFloat();
		System.out.println("Enter the age");
		studage=sc.nextInt();
	}
	void display() {
		//all the data
		System.out.println("studid="+studid);
		System.out.println("studname="+studname);
		System.out.println("studfees="+studfees);
		System.out.println("studage="+studage);
	}
	
}//scope of student data

public class EncapsulationHW {

	public static void main(String[] args) {
		int i; //predefined  4 bytes
	Student ob=new Student(); //size of ob 10 bytes
	ob.accept();
	ob.display();

	}

}

