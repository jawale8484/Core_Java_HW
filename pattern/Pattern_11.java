package pattern;

/*11.	Write a java program to generate a following *'s triangle. 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class Pattern_11 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
