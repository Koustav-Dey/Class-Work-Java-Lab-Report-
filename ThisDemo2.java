class B
{
	B()
	{
		System.out.println("This is class A constructor");
	}
	B(int x)
	{
		this();
		System.out.println(x);
	}
	}
public class ThisDemo2 {

	public static void main(String[] args) {
		B obj=new B(10);
		

	}

}