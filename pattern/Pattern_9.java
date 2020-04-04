package pattern;
/*9.	WAP to print following Pattern 
A
A B
A B C
A B C D 
A B C D E
A B C D E F
*/


public class Pattern_9 {
	public static void main(String[] args) {
		for(char i='A';i<='F';i++) {
			for(char j='A';j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
