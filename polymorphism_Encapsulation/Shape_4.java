package polymorphism_Encapsulation;

import constructor_problem_st_shapes.circle;

/*4.	Create a class named 'Shape' with a method to print "This is shape class".
Then create  another class named 'Rectangle' inheriting the Shape class,
having a method to print "This is rectangular shape" .Create another 
class ‘circle ‘inheriting ‘rectangle’ class and create a method to 
print  "This is circular shape" respectively. Now call the method of
'Shape' and 'Rectangle'
class by the object of ‘circle’ class*/

class Shape_4 {

	void m1() {
		System.out.println("This is shape class");
	}
}

class Rectangle extends Shape_4 {
	void m2() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Rectangle {
	void m3() {
		System.out.println("This is Circular shape");
	}

	public static void main(String[] args) {
		Circle ob = new Circle();
		ob.m1();
		ob.m2();
		ob.m3();

	}
}
