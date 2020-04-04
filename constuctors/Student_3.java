package constuctors;

import java.util.Scanner;

//3.	Create class student and write a meaningful program with 2

//constructors (default and parameterized), 3 methods (1 with return type (calculating percentage), 
//		1 without return type (displaying student data), 1 with parameter list).

public class Student_3 {

	int sub1, sub2, sub3;
	private String vaibhav;

	Student_3() {

		System.out.println("This is default constuctor");
	}

	Student_3(int a, int b, int c) {
		System.out.println("This is parametersied constuctor");
		this.sub1 = a;
		this.sub2 = b;
		this.sub3 = c;
	}

	int m1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter subject marks-");
//		sub1 = sc.nextInt();
//		sub2 = sc.nextInt();
//		sub3 = sc.nextInt();

		int total = sub1 + sub2 + sub3;
		double avg = (total / 300d);
		double per = avg * 100d;
		System.out.println("percantage-" + per);
		return total;
	}

	void m2()
	{
		//String nm=vaibhav;
//		Scanner sc=new  Scanner(System.in);
//		System.out.println("Enter student name-");
		System.out.println("Student name is-vaibhav");

	}
	
	void m3(int a) {
		System.out.println("method with parameter list"+a);
	}

	public static void main(String[] args) {
		Student_3 s = new Student_3();
		Student_3 s1 = new Student_3(75, 85, 95);
		double per = s1.m1();
		s1.m2();
		s1.m3(10);
		
		
	}

}
