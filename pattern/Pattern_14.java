package pattern;

/*14.	Write a program in Java to make such a pattern like 
        a pyramid with a number which will repeat the number in the same row. 
1
2 2
3 3 3
4 4 4 4 
*/
public class Pattern_14 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			
			for(int j=i;j>0;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
