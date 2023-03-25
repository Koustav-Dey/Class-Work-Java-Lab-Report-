import java.util.Scanner;

public class DigitCount {

  public static void main(String[] args) {

    int count = 0, num;
    System.out.println("enter the digit:");
    Scanner sc= new Scanner(System.in);
    num=sc.nextInt(); 

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}