package basicprogram;

import java.util.Scanner;
//create an interface LibraryUser
interface LibraryUser
{
	
	void registerAccount(int age); //default abstract method registerAccount
	void requestBook(String BookType);//default abstract method requestBook
	}
//create a class KidUsers which implements the interface LibraryUser
class KidUsers implements LibraryUser
{
	int age;
	String BookType;
	@Override
	public void registerAccount(int age) { //implement  the method registerAccount for kidsUser class
		// TODO Auto-generated method stub
		this.age=age;
		if (age<=12)
			System.out.println("You have successfully registered under a Kids Account");
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		System.exit(0);
		}
	}
		
	@Override
	public void requestBook(String BookType) {//implement  the method requestBook for kidsUser class
		// TODO Auto-generated method stub
		this.BookType=BookType;
		if(BookType.equalsIgnoreCase("kids"))
			System.out.println("Book Issued successfull please return the book within 10 days");
		else {
			System.out.println("Oops, you are allowed to take only kids books");
			System.exit(0);
		}
		
	}

	}
//create a class AdultUser which implements the interface LibraryUser
class AdultUser implements LibraryUser
{
	int age;
	String BookType;

	@Override
	public void registerAccount(int age) {//implement  the method registerAccount for AdultUser class
		// TODO Auto-generated method stub
		this.age=age;
		if (age>12)
			System.out.println("You have successfully registered under an Adult Account");
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	System.exit(0);
		}
	}

	@Override
	public void requestBook(String BookType) {//implement  the method requestBook for AdultUser class
		// TODO Auto-generated method stub
		this.BookType=BookType;
		if(BookType.equalsIgnoreCase("fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
			System.exit(0);
		}
	}
	}
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("=========================");
		System.out.println("1.Kids\n2.Adults\n3.Exit");//option for choose category
		System.out.println("enter your choice: ");
		
		Scanner sc=new Scanner(System.in);// create instance of Scanner class
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		KidUsers ku=new KidUsers();			//create instance of KidUsers class
		ku.registerAccount(age);			//invoke the method registerAccount for KidUsers class
		System.out.println("Enter the book category: ");
		String cat=sc.next();				
		ku.requestBook(cat);				//invoke the method requestBook for KidUsers class
		break;
		case 2:
		
		System.out.println("Enter your age: ");
		 age=sc.nextInt();
		 AdultUser ad=new AdultUser();		//create instance of AdultUser class
		ad.registerAccount(age);			//invoke the method registerAccount for AdultUser class
		System.out.println("Enter the book category: ");
		cat=sc.next();						
		ad.requestBook(cat);				//invoke the method requestBook for AdultUser class
		break;
		case 3:
			System.exit(0);
		default: System.out.println("Choose correct option");
		}	
	}while(true);
	}

}
