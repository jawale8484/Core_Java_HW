package abstraction_interface;
//1.	Create 2 abstract classes Abs1 and Abs2 each with different
//implemented methods doAbs1() and doAbs2() respectively.
//Check if you can create a class Temp which extends both the abstract classes.
//(Note- A class cannot extend 2 classes simultaneously)
abstract  class abs1_1 {
	void doAbs1() {
		System.out.println("DoAbs-1 method in abstract class");
	}

}
abstract class abs2 extends abs1_1{
	void doAbs2() {
		System.out.println("DoAbs-2 method in abstract class");
	}
	
}

//class temp extends abs1_1,abs2{   //A class cannot extend 2 classes simultaneously
	class temp extends abs1_1{
		public static void main(String[] args) {
			
		}
}