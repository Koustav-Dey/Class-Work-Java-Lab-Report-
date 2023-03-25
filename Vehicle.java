import java.util.Scanner;

class Bike1 // create a class Bike
{
	// instance variable
	String engine;
	String name;
	final int wheel=2;// declare wheel as final
	String avil="avilable";
	//constructor
	Bike1(String engine,String name)
	{
		this.engine=engine;
		this.name=name;
	}
	
	
	}
//User1 class extends Bike1 class
class User1 extends Bike1
{
	User1(String engine, String name) {
		super(engine, name);
		// TODO Auto-generated constructor stub
	}
	// instance variable
	String UserName;
	Long lNo;
	// method for store user details
	void userdetails(String UserName,Long lNo)
	{
		this.UserName=UserName;
		this.lNo=lNo;
		
	}
	// method to print user details
	void assignRider()
	{
		System.out.println(name+" is assign to "+UserName);
		System.out.println("Bike name: "+name+"\n Engine: "+engine+"\nWheel: "+wheel+"\n RiderName: "+UserName+"\n Lisence No: "+lNo+"\nAvilability: "+avil);
	}
	}
//main class
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the Bike category");
		String name=sc.next();
		System.out.println("Enter the engine name: ");
		String engine=sc.next();
		System.out.println("Enter your name: ");
		String UserName=sc.next();
		System.out.println("Enter Lisence No: ");
		Long lNo=sc.nextLong();
		User1 us=new User1(engine,name);// pass the value through constructor
		us.userdetails(UserName,lNo);// invoke the method userdetails
		us.assignRider();// invoke the method assignRider
		
	}

}
