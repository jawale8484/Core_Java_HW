package inheritance;
//6.	WAP to create a class Kid with method readBook() and another method readBook () 

//with 2 parameters. The method readBook here is over-loaded (same method name but
//		different parameters).Create a class BigKid which extends Kid created above. 
//Implement readBook() differently in BigKid class.
//Here the method readBook() has been over-ridden in the child class BigKid()

public class Kid_6 {
	void readbook() {
		System.out.println("This is parent class method");
	}
	void readbook(int a, int b) {
		System.out.println("This method is overload from his current class method");
	}
}
class Bigkid extends Kid_6 {
	@Override
	void readbook() {
		System.out.println("This is Child class method which is over-ridden from parent class");

	}
	public static void main(String[] args) {
		Bigkid ob = new Bigkid();
		ob.readbook(10, 20);
		ob.readbook();

	}
}
