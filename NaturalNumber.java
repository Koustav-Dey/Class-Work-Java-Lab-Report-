import java.util.Scanner; //import Scanner class
public class NaturalNumber
{
public static void main(String[] args)
{
int i,n; //declare two variable
int sum=0; //intilize to 0
System.out.println("Enter the number:"); //take input
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++) //n times loop
{
sum=sum+i;
}
System.out.println("after n number of sum we get:"+sum); //print the sum
}
}