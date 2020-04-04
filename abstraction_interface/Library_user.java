package abstraction_interface;

public interface Library_user {
	void RegisterAccount();

	void RequestBook();

}
class Kidsuser implements Library_user{
	int age;
	String booktype;
	
	// constructor
	Kidsuser(int age,String booktype) {
	this.age=age;
	this.booktype=booktype;
	}
	
	@Override
	public void RegisterAccount() {
		if(this.age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}else
		 {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void RequestBook() {
		if(this.booktype=="kids") {
			System.out.println("Book Issue Succesfully, Please return the book within ten days..");
		}else {
			System.out.println("Oops,You'r allowed to take kid's books ");
		} 
		
	}
	
	
}
class Adultuser implements Library_user{
	int age;
	String booktype;
	
	// constructor
	 Adultuser(int age,String booktype) {
		this.age=age;
		this.booktype=booktype;
	}
	
	@Override
	public void RegisterAccount() {
		if(age>12) {
			System.out.println("You have sucessfully registered under adult account");
		}
		
		else if(age<12) {
			System.out.println("Sorry age must be greatter than 12 to register as an adult");
		}
	}
	@Override
	public void RequestBook() {
		// TODO Auto-generated method stub
		if(booktype=="Fiction") {
			System.out.println("Book Issueed Sucessfully,Please return ths book within 60 days");
			
		}else {
			System.out.println("You'r allowed to take adult fiction books");
		}
	}
}
	class LibraryInterfaceDemo{
		public static void main(String[] args) {
			Kidsuser ob1=new Kidsuser(22,"kids");
			Kidsuser ob=new Kidsuser(11,"kids");
			ob1.RegisterAccount();
			ob.RegisterAccount();
			ob1.RequestBook();
			
			Kidsuser ob2=new Kidsuser(18, "fiction");
			System.out.println();
			ob2.RegisterAccount();
			ob2.RequestBook();
			
			
			Adultuser a=new Adultuser(22,"Kids");
			System.out.println();
			a.RegisterAccount();
			a.RequestBook();
			System.out.println();
			
			
			Adultuser ad=new Adultuser(25,"fiction");
			ad.RegisterAccount();
			ad.RequestBook();
			
			
		}
	}