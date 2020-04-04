package inheritance;
//7.	WAP to Show 3 use of final - final class, final variable and final method

final class demo {

}

// public class Final_7 extends demo{ // final claas cannot been extend

class Final_7 {

	final int b = 20;
	final int a; // defaul final variable must be initial in current class constructor

	public Final_7() {
		a = 5;
	}

	void m1() {
	//	 b = 10;   // final variable cannot been change it's value
	}

	final void demo() {

	}

}
 class abc extends Final_7{
	// void demo() {  // final method are cannot been over-rided
		  static final int num;
		  static {
			  num=10;  // static final variable only initial in static block
		  }
	 
 }
