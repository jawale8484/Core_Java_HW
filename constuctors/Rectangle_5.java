package constuctors;
//5.	Create a class named 'Rectangle' with two data members- length and breadth and

//a method to calculate the area which is 'length*breadth'.
//The class has three constructors which are: 
//	1 - having no parameter - values of both length and breadth are assigned zero.
//	2 - Having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
//	3 - Having one number as parameter - both length and breadth are assigned that number.
//	Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas

public class Rectangle_5 {
	int length, breadth;

	Rectangle_5() {
		System.out.println("this is default consctuctor");

	}
	Rectangle_5(int a,int b){
		length=a;
		breadth =b;
		double area=length*breadth;
		System.out.println();
		System.out.println("this is second constuctor....");
		System.out.println("Area of rectangle-"+area);
	}
	Rectangle_5(int a){
		length=a;
		breadth=a;
		double area=length*breadth;
		System.out.println();
		System.out.println("this third constuctor");
		System.out.println("Area of rectangle is-"+area);
	}
	public static void main(String[] args) {
		Rectangle_5 r=new Rectangle_5();
		Rectangle_5 r1=new Rectangle_5(12,3);
		Rectangle_5 r2=new Rectangle_5(5);
	}
}


