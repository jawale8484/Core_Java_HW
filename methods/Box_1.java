package methods;
//1.	Create one class Box having instance variables (height, width, depth). 
//Add one method to calculate volume with void return type.
import java.io.*;
import java.util.*;
 
class Box{
	int ht,wd,dt;
	void Calculate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Box Height-Width-Depth");
		ht=sc.nextInt();
		wd=sc.nextInt();
		dt=sc.nextInt();
		
		
		int volume=ht*wd*dt;
		System.out.println("Volume of Box is-"+volume);
		
	}
	
}
public class Box_1 {
	public static void main(String[] args) {
		
		Box b=new Box();
		b.Calculate();
	}

}
