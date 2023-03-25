package thread;
import java.util.Scanner;

class Account
{
	private int balance;
	public Account(int balance)
	{
		this.balance=balance;
	}
	public boolean isSufficient(int w)
	{
		if(balance>w)
			return (true);
		else
			return(false);
	}
	public void withdraw(int amt)
	{
		balance=balance-amt;
		System.out.println("withdrawl money is "+amt);
		System.out.println("your current balance is: "+balance);
	}
	}
class Customer implements Runnable
{
	private String name;
	private Account account;
	public Customer(Account account,String n)
	{
		this.account=account;
		name=n;
		
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		synchronized(account) {
		System.out.println("Enter the withdrawl amt: ");
		int amt=sc.nextInt();
		if(account.isSufficient(amt))
		{
			System.out.println(name);
			account.withdraw(amt);
		}
		else {
			System.out.println("insufficient balance");
		}
		}
	}
	}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Account ac=new Account(1000);
		Customer c1=new Customer(ac,"Shail");
		Customer c2=new Customer(ac, "Monojit");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();

	}

}