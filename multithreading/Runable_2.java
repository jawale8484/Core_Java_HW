package multithreading;

//2.	Create thread by implementing runnable interface.
public class Runable_2 implements Runnable {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Hello-java");

		}
	}
	public static void main(String[] args) {
		Runable_2 ob=new Runable_2();
		Thread t1=new Thread(ob);
		t1.start();
	}
}
