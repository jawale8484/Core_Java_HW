package methods;
import java.util.*;
public class Calculator_8 {
	int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	int calculatediffernce(int num1,int num2) {
		int diff=num1-num2;
		return diff;
		
	}

	public static void main(String[] args) {
		Calculator_8 c=new Calculator_8();
		 int sum1=c.calculateSum(10, 20);
		 System.out.println("sum-"+sum1);
		 int diff1=c.calculatediffernce(20, 5);
		 System.out.println("differnce-"+diff1);
		 

	}

}
