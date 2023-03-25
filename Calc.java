import java.util.Scanner;
public class Calc
{
public static void main(String args[])
{
int n,a,b;
System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n");
System.out.println("enter valid input:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n){
case 1:
System.out.println("enter first number:");
a=sc.nextInt();
System.out.println("enter second number:");
b=sc.nextInt();
System.out.println("after the addition we get:"+" "+(a+b));
break;
case 2:
System.out.println("enter first number:");
a=sc.nextInt();
System.out.println("enter second number:");
b=sc.nextInt();
System.out.println("after the substraction we get:"+" "+(a-b));
break;
case 3:
System.out.println("enter first number:");
a=sc.nextInt();
System.out.println("enter second number:");
b=sc.nextInt();
System.out.println("after the multiplication we get:"+" "+(a*b));
break;
case 4:
System.out.println("enter first number:");
a=sc.nextInt();
System.out.println("enter second number:");
b=sc.nextInt();
System.out.println("after the division we get:"+" "+((float)a/(float)b));
break;
case 5:
System.exit(0);
break;
default:
System.out.println("invalid input");
}
}
}



