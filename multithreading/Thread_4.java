package multithreading;


/*
4.	Thread t1 prints numbers 1 to 10. Thread t2 prints characters a to h. Ensure that
always characters are printed first and then numbers using join method.*/



class t1 extends Thread {
	public void run() { // Thread t1 prints numbers 1 to 10
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}
}
class t2 extends Thread {
	public void run() { // Thread t2 prints characters a to h
		for (char i = 'a'; i <= 'h'; i++) {
			System.out.println(i);
		}
	}
}

public class Thread_4 {
	public static void main(String[] args) throws InterruptedException {
		t1 ob1 = new t1();
		t2 ob2 = new t2();
		ob1.start();
		ob2.start();
		ob2.join();
	}
}
