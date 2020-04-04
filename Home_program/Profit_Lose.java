package Home_program;

import java.util.*;

public class Profit_Lose {
public static void main(String[] args) {
	int profit,loss;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Billing price");
	int billp=sc.nextInt();
	System.out.println("Enter the selling price");
	int sellp=sc.nextInt();
	
	if(sellp>billp) {
	System.out.println("Profit");
	profit=sellp-billp;
	System.out.println("profit is"+profit);
	}
	else if(sellp<billp){
		System.out.println("loss");
		loss=billp-sellp;
		System.out.println("lose is"+loss);
	}
}
}
