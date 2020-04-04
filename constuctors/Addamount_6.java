package constuctors;
//6.	Suppose you have a Piggy Bank with an initial amount of $50 and you have

//to add some more amounts to it. Create a class 'AddAmount' with a data member 
//named 'amount' with an initial value of $50. Now make two constructors of
//this class as follows:
//1 - without any parameter - no amount will be added to the Piggie Bank
//2 - having a parameter which is the amount that will be added to Piggie Bank
//Create object of the 'AddAmount' class and display the final amount in Piggie Bank

public class Addamount_6 {
	int amount=50;
	Addamount_6(){
		System.out.println("this is first constructor ");
	}
	Addamount_6(int a){
		System.out.println();
		System.out.println("This is second constructor");
		double total=amount+a;
		System.out.println("Initialized amount=50");
		System.out.println("Added amount="+a);
		System.out.println("Total amount--"+total);
		
	}
	public static void main(String[] args) {
		Addamount_6 a=new Addamount_6();
		Addamount_6 a1=new Addamount_6(10);
	}
}
