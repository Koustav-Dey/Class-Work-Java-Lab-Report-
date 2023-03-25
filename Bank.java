import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		int balance = 160000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Option \n1.Withdrew\n2.Deposit");
		int option =sc.nextInt();
		if (option== 1) {
		System.out.println("Enter your Withdrew Amount");
		int withdrew = sc.nextInt();
		if(withdrew<balance) {
			System.out.println("withdraw Successful");
			System.out.println( );
		}
		else {
			System.out.println("Withdraw Unsuccessful");
			System.out.println();
		}
	}
		else if (option== 2 ) {
			System.out.println("Enter your Deposit Amount");
			int Deposit = sc.nextInt();
			balance = Deposit+balance;
			System.out.println("Your Balance is " +balance);
				System.out.println( );
		}
		else if(option!=1 || option!=2){
		System.out.println("Choose correct option");
		}
	}
}