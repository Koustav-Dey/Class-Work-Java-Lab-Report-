import java.util.Scanner; //import scanner class
public class ReverseNumber   
{  
public static void main(String[] args)   
{  
int number, reverse = 0;
System.out.println("enter the digit:"); //take user input
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
while(number != 0)  //looping end if number equal to 0 
{  
int remainder = number % 10;  //store remainder
reverse = reverse * 10 + remainder;  //reverse the stored number
number = number/10;  //condition ending statement
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  