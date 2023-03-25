package basicprograms;
/*final*/ class Bike
{
	final void speed()
	{
		System.out.println("150Kmh");
	}
}

public class FinalVariableDemo extends Bike{
	//final class cannot be extends
	/*void speed() //final method cannot be override
	{
		System.out.println("160Kmh");
	}*/
	final int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableDemo demo=new FinalVariableDemo();
		//demo.a=40; //cannot assign value to final variable
		System.out.println(demo.a);
		demo.speed();
		
	}

}
