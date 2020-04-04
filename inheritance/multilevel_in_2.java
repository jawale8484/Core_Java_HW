package inheritance;
//2.	Create 3 class tests and define methods explaining the concept of multilevel inheritance

class first{
	void v1() {
		System.out.println("This is parent class method");
	}
}
class second extends first{
	void  v2() {
		System.out.println("This is child class method");
	}
}
class third extends second{
	void v3() {
		System.out.println("This is third class method which is \n inherit onther derived class");
	}
}
class multilevel_in_2 {
	public static void main(String[] args) {
		third ob=new third();
		ob.v1();
		ob.v2();
		ob.v3();
		
	}

}
