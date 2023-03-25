package basicprograms;
//The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
import java.util.Scanner;
class DiffrenceOfSum //class declaration
{
    public static int differenceOfSum (int m, int n) //pass parameters within diffrenceOfSum
    {
        int sum1 = 0, sum2 = 0; //declare variables
        for (int i = 1; i <= m; i++) //loop iterate m times
        {
            if (i % n == 0) //check divisible by n
                sum1 = sum1 + i;
    	    else    
                sum2 = sum2 + i; //not divisible by n
        }
        return Math.abs (sum1 - sum2); //return difference between sum
    }
  
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt (); //take n input
        int m = sc.nextInt (); //take m input
        System.out.println (differenceOfSum (m, n)); //call the method
    } 
}
