package polymorphism_Encapsulation;

/*6.	Create a class Cycle with member variables: int accountNo,
 noOfWheels. Create a default constructor with a SOP in it
 “I am default constructor “Create another constructor which takes 2 arguments,
 calls the default constructor using this () and has a SOP in it 
 “I am another constructor”. In main method, create an object of type Cycle by 
 using default constructor. Note the output. Create another object of type Cycle by 
 using the parameterized constructor. Note the sequence of SOPs indicating 
that inner most constructors are called first.
*/
public class Cycle_6 {
	int accountno, noOfWheels;
		Cycle_6() {
	System.out.println("I am default constructor");
	
		}
	Cycle_6(int a,int s){
		this();
		
}
}
