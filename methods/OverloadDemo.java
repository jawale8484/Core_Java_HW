package methods;
//5.	Create 4 overloaded methods for “test ()” and invoke all 

//versions of the overloaded methods.
//Create another class Overload.java which has a main method to 
//call the overloaded methods in OverloadDemo.java

class OverloadDemo {
	void test() {
		System.out.println("This is no parameter method");

	}

	void test(int i) {
		System.out.println("This is single parameter method-" + i);
	}

	void test(int i, int j) {
		int add = i + j;
		System.out.println("Addition-" + add);
	}

	void test(int i, int j, int k) {
		int add = i + j + k;
		System.out.println("Addition-" + add);
	}
}
