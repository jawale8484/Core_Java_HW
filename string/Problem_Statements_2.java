package string;

public class Problem_Statements_2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This is Buffer");
		System.out.println(sb);
		
		//1.	Adds the string ”- This is a sample program” to 
		//existing string and display it.
		System.out.println("\n Add string...");
		System.out.println(sb.append(" This is Simple Program"));
		
//		2.	Inserts the string “Object” into the existing string 
//		at 21st postion and display it.
		System.out.println("\n Insert...");
		System.out.println(sb.insert(22," Object"));
		
		
		
		//4.	Replaces the word “Buffer” with “Builder” and display it.
		System.out.println("\n Aftewr replace...");
		StringBuilder sbu=new StringBuilder(sb);
		String s=sb.toString(); // convert StringBuffer into string
		System.out.println(s);
		System.out.println(s.replace("Buffer", "Builder"));
	
		
		//3.	Reverses the entire string and displays it.
		System.out.println("\n After reverse..");
		System.out.println(sb.reverse());
		
		
	}

}
