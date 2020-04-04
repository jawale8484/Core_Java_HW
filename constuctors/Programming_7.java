package constuctors;
//1.	Create a class named 'Programming'. While
//creating an object of the class, if nothing is passed to it, 
//then the message "I love programming languages" should be printed. 
//If some String is passed to it, then in place of "programming languages" the
//name of that String variable should be printed.
//For example, while creating object if we pass "Java", then "I love Java"
//should be printed.


public class Programming_7 {
	 Programming_7(){
		 System.out.println("I love Programming langauges");
	 }
	 Programming_7(String a){
		 System.out.println("I love "+a);
	 }
public static void main(String[] args) {
	 Programming_7 p=new Programming_7();
	 Programming_7 p1=new Programming_7("java");
}
}
