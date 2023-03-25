package basicprograms;
//You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
import java.util.Scanner;

public class MovingHash {

	public static void moveHash(String str ,int n) //define method for moveHash
    {
        String str1= new String(""); //create first string instance
        String str2= new String(""); //create second string instance
        int i=0;
        for(i=0;i<n;i++)
        {
            if(str.charAt(i)=='#') //find character in string
                str1=str1 + str.charAt(i); //concatenate with string
            else
                str2 = str2 + str.charAt(i);
        }
        String result = str1.concat(str2); //store result after concatenation
        System.out.println(result); //print the result
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int len= a.length(); //calculate length
        moveHash(a, len); //pass parameter to the method
    }

}
