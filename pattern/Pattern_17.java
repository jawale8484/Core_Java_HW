package pattern;

/*17.	Write a Java program to display the number rhombus structure. 
1                                                  
2 1 2                                                 
3 2 1 2 3                                                
4 3 2 1 2 3 4  
*/
public class Pattern_17 {
public static void main(String[] args) {
	
	for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(i);
		}
		
		System.out.println();
	}
	
}
}
