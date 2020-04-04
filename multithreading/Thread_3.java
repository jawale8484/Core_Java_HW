package multithreading;
/*3.	Create 3 threads. First thread displays days of a week.
Second thread displays table of 5.Third thread displays Fibonacci series.
*/

class thread1 extends Thread {
	// First thread displays days of a week.
	public void run() {
		System.out.println("Display days of week");
		System.out.println("\n Monday \n Tuesday \n Wednesday \n thursday \n Friday \n Saturday \n sunday");
	}
}

class thread2 extends Thread {
	// Second thread displays table of 5
	public void run() {
		System.out.println("Display table of 5-");
		int n = 5, sum;
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum = n * i);
		}

	}
}

class thread3 extends Thread {
	//Third thread displays Fibonacci series
	public void run() {
		System.out.println("Fibonacci series are-");
		int num1=0,num2=1,total;
		for (int i = 1; i <6; i++) {
			total=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=total;
			total=num1;
			
		}
	}
}

public class Thread_3 {
	public static void main(String[] args) {
		thread1 ob1 = new thread1();
		thread2 ob2 = new thread2();
		thread3 ob3=new thread3();
		ob1.setPriority(8);
		ob1.start();
		ob2.setPriority(5);
		ob2.start();
		ob3.setPriority(2);
		ob3.start();
	}
}
