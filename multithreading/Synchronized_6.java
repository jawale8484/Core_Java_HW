package multithreading;
//6.	Show example

//of synchronized method in which two threads are trying to update same thread.

class synchro {
	synchronized void show(int num) {
		//int num = 0;
		for (int i = 1; i <= 10; i++) {
			int sum = num * i;
			System.out.println(sum);
		}
		System.out.println("---------------");
	}
}

class th1 extends Thread {
	synchro ob;

	public th1(synchro ob) {
		this.ob = ob;
	}
	
	public void run() {
		ob.show(5);
	}
}

class th2 extends Thread {
	synchro ob;

	public th2(synchro ob) {
		this.ob = ob;

	}
	public void run() {
		ob.show(10);
	}
}

public class Synchronized_6 {
	public static void main(String[] args) {
		synchro ob = new synchro();
		th1 ob1=new th1(ob);
		th2 ob2 =new th2(ob);
		
		ob1.start();
		ob2.start();

	}
}
