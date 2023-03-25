package basicprograms;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[]arr = new int[n];
		for(int i = 0; i < n; i++)
		{
		arr[i] = sc.nextInt();
		}
		int count_odd =0, count_even = 0;
		for(int i = 0; i < n; i++)
		{
		if(arr[i] % 2 == 1)
		count_odd++;
		else
		count_even++;
		}
		System.out.println("Odd:"+ count_odd);
		System.out.println("Even:" + count_even);
	}

}
