package methods;
//10.	Create a Java class “Square.java” with a method “calculateArea”

//This method should accept length as an argument,
//calculate the area and return the area.
//The main method should invoke the Square objects “calculateArea” 
//method by passing a value for the length, say 20.
//The main method should also print the area (result).

import java.util.Scanner;

public class Square_10 {

	Scanner sc = new Scanner(System.in);

	void calculateArea(int length) {
		int area = length * length;
		System.out.println("Area of Square-" + area);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square_10 s = new Square_10();
		System.out.println("Enter Length of square");
		int ln = sc.nextInt();
		s.calculateArea(ln);

	}

}
