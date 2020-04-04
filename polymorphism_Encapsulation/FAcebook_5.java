package polymorphism_Encapsulation;

/*5.	In our FaceBook profile,  we would like to hide the age,
marital status and phone number information to the external world. 
This can be done using encapsulation where the fields are made
private and can be accessed only by the
accessor(getter) and mutator (setter)methods.  
*/
public class FAcebook_5 {
  private int age;
  private long phono;
  private String marital_st;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhono() {
	return phono;
}
public void setPhono(long phono) {
	this.phono = phono;
}
public String getMarital_st() {
	return marital_st;
}
public void setMarital_st(String marital_st) {
	this.marital_st = marital_st;
}
  


  @Override
public String toString() {
	return "FAcebook_5 [age=" + age + ", phono=" + phono + ", marital_st=" + marital_st + "]";
}
public static void main(String[] args) {
	  FAcebook_5 ob=new FAcebook_5();
	  ob.setAge(22);
	  ob.setMarital_st("unmarriedd");
	  ob.setPhono(8484907403L);
	  
	  System.out.println(ob.toString());
}
  
}
