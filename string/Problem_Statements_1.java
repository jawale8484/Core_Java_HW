package string;

public class Problem_Statements_1 {
	public static void main(String[] args) {
		String s=new  String("Welcome to java world");
		System.out.println(s);
		
		//•	Returns the character at 5th position and display it.		
		s.charAt(5); // it is not execute bcz literal string give only references
		System.out.println("\n character at 5th position ");
		System.out.println(s.charAt(5));
		
		/*
		 * • Compares the above String with “Welcome” lexicographically ignoring case
		 * differences and display the result.
		 */System.out.println("\n Compare...");
		System.out.println(s.compareTo("Welcome"));
		System.out.println(s.compareToIgnoreCase("welcome"));
		
		/*
		 * • Concatenates “- Let us learn” to the above string and display it.
		 */System.out.println("\n Conacatination...");
		 System.out.println(s.concat(" Let us Learn"));
		 
		/*
		 * • Returns the position of the first occurrence of character ‘a’ and display
		 * it.
		 */System.out.println("\n first occurrence of character ‘a’");
		 
		 char[] ch=s.toCharArray();
		 int count=0;
		 for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a') {
				System.out.println(ch[i]+" "+i);
			}
		}
		 
		/*
		 * • Replaces all the occurrences of ‘a’ character with the new ‘e’ and display
		 * it.
		 */System.out.println("\n Replace a with e");
		 System.out.println(s.replace('a','e'));
		 
		 
		 
		 //•	Returns string between 4th position and 10th position and display it.
		 System.out.println("\n return  4th position and 10th");
		 System.out.println(s.substring(4,10));
		 
		 //•	Returns the lowercase of the string and display it.
		 System.out.println("\n lowercase...");
		 System.out.println(s.toLowerCase());
	}

}
