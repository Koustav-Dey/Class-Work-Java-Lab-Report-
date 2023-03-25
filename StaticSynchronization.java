package thread;
class PrintData1{
	static void multiplication(int n)
	{
		System.out.println("out of synchronize block");
		//syncronized block on a class lock
		synchronized(PrintData1.class)
		{
			System.out.println("multiplication");
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
			}
		}
		System.out.println("rest of code which is not synchronized");
	}
}
class Sum{
	static void sumOfNumbers(int n)
	{
		synchronized(Sum.class)
		{
			System.out.println("Sum of N natural numbers");
			int sum=(n*(+1))/2;
			System.out.println(sum);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class StaticSynchronization {

	public static void main(String[] args) {
		Thread t1=new Thread()
				{
					public void run()
					{
						PrintData1.multiplication(5);
					}
				};
				Thread t2=new Thread()
				{
					public void run()
					{
						PrintData1.multiplication(100);
					}
				};
				Thread t3=new Thread()
				{
					public void run()
					{
						Sum.sumOfNumbers(10);
					}
				};
				Thread t4=new Thread()
				{
					public void run()
					{
						Sum.sumOfNumbers(50);
					}
				};
				t1.start();
				t2.start();
				t3.start();
				t4.start();

	}

}
