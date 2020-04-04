package constuctors;
//4.	Write a program to print the names of students by creating a Student class.
//If no name is passed while creating an object of Student class, then the
//name should be "Unknown", otherwise the name should be equal to
//the String value passed while creating object of Student class.
public class Student_class_4 {
	 Student_class_4() {
		System.out.println("Unlnown");
	}
	Student_class_4(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Student_class_4 s =new Student_class_4();
		Student_class_4 s1=new Student_class_4("vaibahv");
		
	}

}
