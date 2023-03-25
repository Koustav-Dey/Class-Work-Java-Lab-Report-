class A
{
	public void m()
	{
		System.out.println("This is method m");
	}
	public void n()
	{
		System.out.println("This is method n");
		m();
	}
	}
public class ThisDemo {

	public static void main(String[] args) {
		A obj=new A();
		obj.n();

	}

}