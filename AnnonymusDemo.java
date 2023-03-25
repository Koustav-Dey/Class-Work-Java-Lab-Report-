package thread;

interface Anonymus
{
	void show();
	void run();
}
public class AnnonymusDemo{

	public static void main(String[] args) {
		Anonymus obj=new Anonymus() {
			@Override
			public void show()
			{
				System.out.println("Hello anonymus");
			}
			@Override
			public void run()
			{
				System.out.println(5*8);
			}
		};
		obj.show();
		obj.run();

	}

	

}
