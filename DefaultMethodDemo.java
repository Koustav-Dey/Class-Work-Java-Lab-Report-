package thread;
interface Drawable
{
	void draw();
	default void message()
	{
		System.out.println("since java 8 we specify method body using default");
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
}
class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a circle");
	}
	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.draw();
		c.message();
		int mul=Drawable.multiply(5, 4);
		System.out.println(mul);
	}

}
