package pattern;
/*
7.	WAP to print following Pattern

*
* *
* * *
* * * **/


public class Pattern_7 {
public static void main(String[] args) {
	
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
