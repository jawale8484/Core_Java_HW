package multithreading;

public class Multi_demo extends Thread {
	public void run() {
for(int i=0;i<10;i++) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);
	
}
	}
}
class second extends Thread{
	public void run() {
		for (char i = 'a'; i <'h'; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Multi_demo ob1=new Multi_demo();
		second ob2=new second();
		ob1.start();
		ob2.start();
		ob2.join();
	}
}
