import java.util.Scanner;

public class large_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :"); 
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int num3 = sc.nextInt();

        if (num1>num2 && num1<num3) {
          System.out.println("number 1 is greater");
        }
        else if (num2>num3 && num2>num1) {
            System.out.println("number 2 is greater");
        }
        else
        {
            System.out.println("number 3 is greater");
        }
    }
}
