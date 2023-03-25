package thread;
public class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt,"My Thread");
		t1.start();
	}
}
