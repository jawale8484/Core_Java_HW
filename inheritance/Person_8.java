package inheritance;
//8.	Create class Person which has attributes (name, gender, age, Address). .
//Address is class which has attributes (city, state, country). Display Persons data 
//Note. Containment using constructor and getter/setter 

class Address{
	String city,state,country;
	public Address(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
}

public class Person_8 extends Address {
	String name,gender;
	int age;
	Address ad;
	
		Person_8(String name,String gender,int age,Address ad) {			
			super(ad.city,ad.state,ad.country);
		 this.name=name;
		 this.gender=gender;
		 this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		//Person_8 ob=new Person_8("vaibhav", "male", 22, "pune"  );
		
	}

}
