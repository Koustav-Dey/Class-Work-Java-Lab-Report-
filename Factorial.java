import java.util.Scanner; //import scanner class
   public class Factorial {
      public static void main(String args[]){
         int i, factorial=1, number; //declare and initialize variables 
         System.out.println("Enter the number to which you need to find the factorial:"); //take user input
         Scanner sc = new Scanner(System.in); 
         number = sc.nextInt();

         for(i = 1; i<=number; i++) {
            factorial = factorial * i;
         }
         System.out.println("Factorial of the given number is:: "+factorial); //print the output
      }
   }