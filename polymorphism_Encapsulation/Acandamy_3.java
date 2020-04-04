package polymorphism_Encapsulation;
//3.	Create Academy class with appropriate attributes (instance variable)

//and create getter & setter methods.

public class Acandamy_3 {
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
		return "Acandamy_3 [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Acandamy_3 ob=new Acandamy_3();
		ob.setId(11);
		ob.setName("JSPM JSCOE,PUNE");
		
		
		System.out.println(ob.toString());
	}
	
}
