package abstraction_interface;

abstract class constructor_abs_4 {
	constructor_abs_4(int a,int b) {
		System.out.println("Paramerized constructor in parent class"+a+" "+b);
	}
}
 class child1 extends constructor_abs_4{

	child1() {
		super(10,20);
		System.out.println("");
		
	}
	public static void main(String[] args) {
		child1 ob=new child1();
	}
}
