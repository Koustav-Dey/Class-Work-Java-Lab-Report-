import java.util.Scanner;

public class MultplicationTable {

	public static void main(String[] args) {
		
		int n;//declare a variable n
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Number: ");
		n=sc.nextInt();//take input from user and store the value in the variable n
		//loop for generating the numbers upto 10
		for(int i=1;i<=10;i++)//i is a counter variable
		{
			System.out.println(n+" * "+i+" = "+i*n);//output
		}
		sc.close();

	}

}