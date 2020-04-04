package multithreading;
class synchro_1{
	synchronized static void m1() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Hello java");
		}
	}
	synchronized  void m2() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Baby");
		}
	}
	
}

class thr1 extends Thread{
	synchro_1 ob1;
	public thr1(synchro_1 ob) {
		this.ob1=ob;
	}
	public void run() {
		ob1.m1();
	}
}
class thr2 extends Thread{
	synchro_1 ob2;
	public thr2(synchro_1 ob) {
		this.ob2=ob;
	}
	public void run() {
		ob2.m2();
	}
}
 class Synchronized_8{
	 public static void main(String[] args) {
		synchro_1 s1=new synchro_1();
	//	synchro_1 s2=new synchro_1();
		
		
		thr1 t1=new thr1(s1);
		thr2 t2=new  thr2(s1);
		
		t1.start();
		t2.start();
	}
}
