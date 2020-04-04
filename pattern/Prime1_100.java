package pattern;

public class Prime1_100 {
public static void main(String[] args) {
	System.out.println("Prime no are-");
	for(int i=1;i<=100;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println(i);
			}
		
	}
}
	
}
