package basicprograms;

import java.util.Scanner;

public class PallindromeChecking {

	public static void stringPalidrom(String str)
	{
		String ch="";// initialize null string
		//logic of reverse of a string
		for(int i=str.length()-1;i>=0;i--)
		{
			 ch=ch+str.charAt(i);
		}
		//check for palindrome or not
		if(str.equalsIgnoreCase(ch))
			System.out.println("String is palindrome");
		else
			System.out.println("string is not palindrome");
		
	}
	public static void main(String[] args) {
		while(true)
		{
		System.out.println("enter the string: ");
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();// take the input from users
		stringPalidrom(str);//invoke the method stringPalindrom
		}
	}

}