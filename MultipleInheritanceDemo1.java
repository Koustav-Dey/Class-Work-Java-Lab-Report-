package basicprograms;
abstract class A
{
	abstract void display();
	public void demo()
	{
		System.out.println("abstract class");
	}
}
interface in
{
	int add(int a,int b);
}
class Child extends A implements in
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Answer is:");
	}
	
}
public class MultipleInheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		int sum=c.add(6,8);
		System.out.println(sum);
		c.demo();
	}

}
