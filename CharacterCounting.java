package basicprograms;
//online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :
//Input :
//aabbbbeeeeffggg
//Output:
//a2b4e4f2g3
//Input :
//abbccccc
//Output:
//ab2c5
import java.util.Scanner;

public class CharacterCounting {

	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in); //take input
	        String str = sc.nextLine();
	        int i, j, k = 0, count = 0; //initialize variables
	        String uni = new String("");
	        for(i=0; i<str.length(); i++) //traverse complete string
	        {
	            count = 0; //count initialize to 0
	            for(j=0; j<=i; j++)
	            {
	                if(str.charAt(i)==str.charAt(j)) //compare no. of string i,j
	                {
	                    count++; //increment the count
	                }
	            }
	            if(count==1)
	            {
	                uni = uni + str.charAt(i); //concatenate
	            }
	        }
	        for(i=0; i<uni.length(); i++)
	        {
	            count = 0;
	            for(j=0; j<str.length(); j++)
	            {
	                if(uni.charAt(i)==str.charAt(j))
	                {
	                    count++;
	                }
	            }
	            if(count==1)
	            {
	                System.out.printf("%c",uni.charAt(i)); //print the short string
	            }
	            else
	            {
	                System.out.printf("%c%d",uni.charAt(i),count);
	            }
	        }
	    }    
}
