import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
      	System.out.println("Enter number of rows");
      	int r = sc.nextInt();
      
      	for(int i=0;i<=r;i++)
      	{
          for(int j=0;j<=r-i;j++)
          {
              System.out.print("*");
          }
          for(int k=1;k<=i*2-1; k++)
          {
              System.out.print(" ");
          }
          for(int l=r-i; l>=0; l--)
          {
              if(l!=r) 
                  System.out.print("*");
          }
         System.out.println();
      	}
	}
}