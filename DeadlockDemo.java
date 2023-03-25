package thread;

public class DeadlockDemo {

	public static void main(String[] args) {
		final String resource1="paper";
		final String resource2="pen";
		//thread1:prasanta lock resource 1: paper and wanted to lock resource2:pen
		Thread prasanta=new Thread()
				{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Prasanta locked Resource 1:paper");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//thread1:prasanta trying to lock resource2:pen
					synchronized(resource2)
					{
						System.out.println("wanted to lock resource2:pen");
					}
				}
			}
			
				};
				
				//Thread2:sachin lock resource2:pen and try to lock resource1:paper
				Thread sachin=new Thread()
						{
					public void run()
					{
					synchronized(resource2)
					{
						System.out.println("sachin locked resource2:pen");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//Thread2:sachin trying to lock resource1:paper
						synchronized(resource1)
						{
							System.out.println("wanted to lock resourse1: paper");
						}
					}
					}
					};
					prasanta.start();
					sachin.start();
	}

}
