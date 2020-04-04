package constuctors;
/*8.	Create a class Student with int id and String name as member variables. 
Generate getter and setter methods for id and name. Observe in the generated 
setter method how the parameter’s value is assigned to the member variable using 
this keyword. What would happen in the setter method if you remove ‘this.’ when 
assigning the parameter value?
o	In main create 2 objects of Student. Set id of first student to 11 and 21 to 
the other student’s id. Check and observe if you can use ‘this’ in main method.*/

public class Student_Scenario_8 {
int id;
String name;
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Student_Scenario_8 [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	
	Student_Scenario_8 ob=new Student_Scenario_8();
	Student_Scenario_8 ob1=new Student_Scenario_8();
	int id=11;
	
	ob1.setId(21);
	
	
	
}

}
