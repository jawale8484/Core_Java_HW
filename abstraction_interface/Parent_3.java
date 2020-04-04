package abstraction_interface;

abstract class Parent_3 {
abstract void cook();
 void wash(){
	 System.out.println("Wash method in abstract class");
	 }
}
class child extends Parent_3{

	@Override
	void cook() {
		System.out.println("cool method in abstract class");
		
	}
	public static void main(String[] args) {
		child ob=new child();
		ob.cook();
		ob.wash();
	}
	
}
