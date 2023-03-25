import java.util.Scanner;
import java.lang.Math; 
 
public class square {
     
public static void main(String args[]) {
         
        Double num;
        Scanner sc= new Scanner(System.in); //take the value from user
 
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
         
        Double square = Math.pow(num, 2); //square the number
        System.out.println("Square of "+ num + " is: "+ square);
}
}