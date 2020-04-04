package inheritance;

//3.	Explain the concept of hierarchical inheritance by suitable example.
class first1 {
	void m1() {
		System.out.println("This is parent class method");
		System.out.println();
	}
}

class second2 extends first1 {
	void b1() {
		System.out.println("This class extend from parent class");
		System.out.println();
	}
}

class third3 extends first1 {
	void b4() {
		System.out.println("This class also extend from parent class");
		System.out.println();
	}
}
class Heirarchyial_in_3 {
	public static void main(String[] args) {
		
		second2 ob1=new second2();
		ob1.b1();
		ob1.m1();
		third3 ob =new third3();
		ob.m1();
		ob.b4();
		
	}

}
